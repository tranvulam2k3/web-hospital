package com.web.hospital.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.mapper.dbo.khoaMapper;
import com.web.hospital.model.doctor;
import com.web.hospital.model.khoa;

@Controller
public class homeController {
	
	@Autowired 
	doctorMapper doctorMapper;
	
	@Autowired
	khoaMapper khoaMapper;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<khoa> listKhoa = khoaMapper.getKhoa();
		model.addAttribute("listKhoa", listKhoa);
		List<doctor> listDoctor = doctorMapper.getdoctor();
		model.addAttribute("listDoctor", listDoctor);
		return "index";
	}
}
