package com.web.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.doctor;

@Controller
public class searchController {
	
	@Autowired
	doctorMapper doctorMapper;

	@GetMapping("/search")
	public String search(Model model, doctor doctor) {
		doctor docSearch = doctorMapper.searchbyName(doctor.getHotenbacsi());
		if(docSearch == null) {
			return "404";
		}else {
			model.addAttribute("docSearch", docSearch);
			return "information";
		}	
	}
	
}
