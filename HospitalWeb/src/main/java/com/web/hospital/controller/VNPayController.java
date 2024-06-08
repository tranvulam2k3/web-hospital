package com.web.hospital.controller;

import com.web.hospital.config.VNPAYService;
import com.web.hospital.model.Account;
import com.web.hospital.model.booking;
import com.web.hospital.model.doctor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.web.hospital.mapper.dbo.bookingMapper;

@Controller
public class VNPayController {
    @Autowired
    private VNPAYService vnPayService;

    @Autowired
    private bookingMapper bookingMapper;


    @GetMapping({"/vnpay"})
    public String home() {
        return "createOrder";
    }

    // Chuyển hướng người dùng đến cổng thanh toán VNPAY
    @PostMapping("/submitOrder")
    public String submidOrder(@RequestParam("mount") int orderTotal,
                              @RequestParam("orderInfo") String orderInfo,
                              HttpServletRequest request) {
        String baseUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        String vnpayUrl = vnPayService.createOrder(request, orderTotal, orderInfo, baseUrl);
        return "redirect:" + vnpayUrl;
    }

    // Sau khi hoàn tất thanh toán, VNPAY sẽ chuyển hướng trình duyệt về URL này
    @GetMapping("/vnpay-payment-return")
    public String paymentCompleted(HttpServletRequest request, Model model, booking booking) {
        int paymentStatus = vnPayService.orderReturn(request);

        String orderInfo = request.getParameter("vnp_OrderInfo");
        String paymentTime = request.getParameter("vnp_PayDate");
        String transactionId = request.getParameter("vnp_TransactionNo");
        String totalPrice = request.getParameter("vnp_Amount");

        model.addAttribute("orderId", orderInfo);
        model.addAttribute("totalPrice", totalPrice);
        model.addAttribute("paymentTime", paymentTime);
        model.addAttribute("transactionId", transactionId);

        HttpSession session = request.getSession();

        booking bookingInfo = (booking) session.getAttribute("bookingInfo");
        doctor doc = (doctor) session.getAttribute("doctor");
        Account account = (Account) session.getAttribute("account");

        int maBS = doc.getIdd();
        int id =  account.getId();

        int saveToDB = bookingMapper.save(bookingInfo.getHotenbenhnhan(),
                                      bookingInfo.getNamsinh(),
                                      bookingInfo.getGioitinh(),
                                      bookingInfo.getSdt(),
                                      bookingInfo.getDiachi(),
                                      bookingInfo.getEmail(),
                                      bookingInfo.getHotenbacsi(),
                                      bookingInfo.getLoinhan(),
                                      maBS,
                                      bookingInfo.getMount(),
                                      bookingInfo.getDay(),
                                      id );

        return paymentStatus == 1 ? "ordersuccess" : "orderfail";
    }
}
