package com.web.hospital.controller;

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

@Controller
public class checkoutController {

	@Autowired 
	bookingMapper bookingMapper;
	
	@PostMapping("/checkout")
	public String comfig(Model model,HttpSession session, @ModelAttribute("booking") booking booking) {
		doctor doc = (doctor) session.getAttribute("doctor");
		String tenBS = doc.getHotenbacsi();
		int maBS = doc.getIdd();
		int save = bookingMapper.save(booking.getHotenbenhnhan(), booking.getNamsinh(), booking.getGioitinh(), booking.getSdt(), booking.getDiachi(), 
				booking.getEmail(),tenBS,booking.getNgaydat(),booking.getLoinhan(),maBS);
		booking inf = bookingMapper.getnewbooking();
		model.addAttribute("inf", inf);
		return "checkout";
	}
	
	@GetMapping("/success")
	public String success() {
		return "success";
	}
}
