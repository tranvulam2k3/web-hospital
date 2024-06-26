package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.bookingMapper;
import com.web.hospital.mapper.dbo.historylichkhamMapper;
import com.web.hospital.mapper.dbo.hosoMapper;
import com.web.hospital.model.booking;
import com.web.hospital.model.hoso;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.web.hospital.mapper.dbo.bookingMapper;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hosoBAnCaNhanController {

    @Autowired
    private hosoMapper hosoMapper;

    @Autowired
    private bookingMapper bookingMapper;

    @Autowired
    private historylichkhamMapper historylichkhamMapper;

    @PostMapping("/ho-so-ca-nhan")
    public String hosoBAnCaNhan(Model model, hoso hoso, HttpServletRequest request) {

        model.addAttribute("hoso", hoso);

        HttpSession session = request.getSession();
        session.setAttribute("hosoInfor", hoso);

        return "hosoBenhAnCaNhan";
    }

    @PostMapping("/updatebooking")
    public String update(HttpServletRequest request) {
        HttpSession session = request.getSession();

        hoso hosoInfor = (hoso) session.getAttribute("hosoInfor");

        int update = hosoMapper.insertHoso( hosoInfor.getHotenbenhnhan(), hosoInfor.getNamsinh(),
                                            hosoInfor.getGioitinh(), hosoInfor.getSdt(), hosoInfor.getDiachi(),
                                            hosoInfor.getDay(),hosoInfor.getIdd(), hosoInfor.getHotenbacsi(),
                                            hosoInfor.getChuandoan(), hosoInfor.getDonthuoc());
        int inserttoHistory = historylichkhamMapper.insertHistory(hosoInfor.getStt(), "Đã khám bệnh");
        int delete = bookingMapper.deletebyStt(hosoInfor.getStt());
        return "redirect:/qllich";
    }
}
