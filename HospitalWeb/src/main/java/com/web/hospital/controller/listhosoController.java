package com.web.hospital.controller;

import java.util.List;

import com.web.hospital.mapper.dbo.hosoMapper;
import com.web.hospital.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.MedicalVisitsMapper;
import com.web.hospital.mapper.dbo.doctorMapper;

import jakarta.servlet.http.HttpSession;

@Controller
public class listhosoController {
	@Autowired
	doctorMapper doctorMapper;
	
	@Autowired
	hosoMapper hosoMapper;
	
	@GetMapping("/qlhoso")
	public String hoso(Model model ,HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("checkuser");
	    doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int getiddoc = doc.getIdd();
		List<hoso> listhoso = hosoMapper.selectHosobyIDdoc(getiddoc);
		model.addAttribute("listhoso", listhoso);
		return "qlhoso";
	}
	@GetMapping("/edithoso/{idhoso}")
	public String edit(Model model, @PathVariable("idhoso") int idhoso) {
		hoso list = hosoMapper.findHosoByID(idhoso);
		model.addAttribute("list", list);
		return"editMedical";
	}
	@PostMapping("/updateMedical")
	public String update(Model model, hoso hoso) {
		int update = hosoMapper.updateHosoByID(hoso);
		return "redirect:/qlhoso";
	}
	@RequestMapping("/deletehoso/{idhoso}")
	public String deletebyID(Model model , @PathVariable("idhoso") int idhoso) {
		int delete = hosoMapper.deleteHosoByID(idhoso);
		return "redirect:/qlhoso";
	}
//	@GetMapping("/addMedical")
//	public String showadd() {
//		return "addMedical";
//
//	}
//	@PostMapping("/add")
//	public String addmedical(Model model, MedicalVisits medicalVisits, HttpSession session) {
//		Account loggedInUser = (Account) session.getAttribute("checkuser");
//		doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
//	    int getiddoc = doc.getIdd();
//	    int addmedical = medicalVisitsMapper.addmedical(medicalVisits.getHotenbenhnhan(), medicalVisits.getNgaykham(), medicalVisits.getLidokham(), medicalVisits.getChuandoan(), medicalVisits.getGhichucuabacsi(),medicalVisits.getDonthuoc(), getiddoc);
//		return "redirect:/qlhoso";
//	}
}
