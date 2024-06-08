package com.web.hospital.controller;

import com.web.hospital.model.Account;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.hospital.mapper.dbo.bookingMapper;
import com.web.hospital.model.booking;
import com.web.hospital.model.doctor;

import jakarta.servlet.http.HttpSession;

import java.util.Date;

@Controller
public class checkoutController {

	@Autowired 
	bookingMapper bookingMapper;

	@PostMapping("/checkout")
	public String processBooking(@ModelAttribute booking bookingInfo, Model model, HttpServletRequest request) {
	// Thêm thông tin booking vào model để truyền sang view checkout
	model.addAttribute("inf", bookingInfo);

	//Save thong tin vào session
	HttpSession session = request.getSession();
	session.setAttribute("bookingInfo", bookingInfo);

	return "checkout"; // Trả về trang checkout.html
}

	@GetMapping("/success")
	public String success(HttpServletRequest request, Model model, booking booking) {
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

		return "success";
	}
}
