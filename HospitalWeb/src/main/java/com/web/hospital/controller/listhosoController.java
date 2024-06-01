package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.MedicalVisitsMapper;
import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.Account;
import com.web.hospital.model.MedicalVisits;
import com.web.hospital.model.booking;
import com.web.hospital.model.doctor;

import jakarta.servlet.http.HttpSession;

@Controller
public class listhosoController {
	@Autowired
	doctorMapper doctorMapper;
	
	@Autowired
	MedicalVisitsMapper medicalVisitsMapper;
	
	@GetMapping("/qlhoso")
	public String hoso(Model model ,HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("checkuser");
	    doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int getiddoc = doc.getIdd();
	    System.out.println(getiddoc);
		List<MedicalVisits> list = medicalVisitsMapper.gellAllbyIdd(getiddoc);
		model.addAttribute("list", list);
		return "qlhoso";
	}
	@GetMapping("/edithoso/{id}")
	public String edit(Model model, @PathVariable("id") int id) {
		MedicalVisits list = medicalVisitsMapper.findbyID(id);
		model.addAttribute("list", list);
		return"editMedical";
	}
	@PostMapping("/updateMedical")
	public String update(Model model, MedicalVisits medicalVisits) {
		int update = medicalVisitsMapper.updateMedical(medicalVisits.getHotenbenhnhan(), medicalVisits.getNgaykham(), medicalVisits.getLidokham(), medicalVisits.getChuandoan(), medicalVisits.getGhichucuabacsi(), medicalVisits.getDonthuoc(), medicalVisits.getId());
		return "redirect:/qlhoso";		
	}
	@RequestMapping("/delete/{id}")
	public String deletebyID(Model model , @PathVariable("id") int id) {
		int delete = medicalVisitsMapper.deletebyID(id);
		return "redirect:/qlhoso";
	}
	@GetMapping("/addMedical")
	public String showadd() {
		return "addMedical";

	}
	@PostMapping("/add")
	public String addmedical(Model model, MedicalVisits medicalVisits, HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("checkuser");
		doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int getiddoc = doc.getIdd();
	    int addmedical = medicalVisitsMapper.addmedical(medicalVisits.getHotenbenhnhan(), medicalVisits.getNgaykham(), medicalVisits.getLidokham(), medicalVisits.getChuandoan(), medicalVisits.getGhichucuabacsi(),medicalVisits.getDonthuoc(), getiddoc);
		return "redirect:/qlhoso";
	}
}
