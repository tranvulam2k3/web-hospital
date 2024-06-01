package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.hospital.mapper.dbo.bookingMapper;
import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.doctor;
import com.web.hospital.model.Account;
import com.web.hospital.model.booking;

import jakarta.servlet.http.HttpSession;

@Controller
public class bookingController {
	
	@Autowired
	doctorMapper doctorMapper;
	
	@Autowired 
	bookingMapper bookingMapper;
	
	@GetMapping("/booking/{idd}")
	public String booking(@PathVariable("idd") int idd, Model model,HttpSession session) {
	    Account loggedInUser = (Account) session.getAttribute("checkuser");
	    if (loggedInUser == null) {
	        return "login";
	    }else {
		doctor doc = doctorMapper.getdoctorbyID(idd);
		session.setAttribute("doctor", doc);
		model.addAttribute("doc", doc);
		return "booking";
		}
	}

}
