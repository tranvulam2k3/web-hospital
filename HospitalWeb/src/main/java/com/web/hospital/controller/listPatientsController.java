package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.PatientsMapper;
import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.PatientsExample;
import com.web.hospital.model.booking;
import com.web.hospital.model.doctor;

import jakarta.servlet.http.HttpSession;

import com.web.hospital.model.Account;
import com.web.hospital.model.Patients;

@Controller
public class listPatientsController {

	@Autowired
	doctorMapper doctorMapper;
	
	@Autowired
	PatientsMapper patientsMapper;
	
	@GetMapping("/qlbenhnhan")
	public String Patients(Model model ,HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("checkuser");
	    doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int getiddoc = doc.getIdd();
		List<Patients> list = patientsMapper.listPatientsByidD(getiddoc);
		model.addAttribute("list", list);
		return "qlbn";
	}
	@GetMapping("/editbenhnhan/{idp}")
	public String edit(Model model, @PathVariable("idp") int idp) {
		Patients list = patientsMapper.findbyidp(idp);
		model.addAttribute("list", list);
		return"editBenhNhan";
	}
	@PostMapping("/updateBenhNhan")
	public String update(Model model, Patients patients,HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("checkuser");
		doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    String getnameDoc = doc.getHotenbacsi();
		int update = patientsMapper.updateBenhNhan(patients.getHotenbenhnhan(), patients.getNamsinh(), patients.getGioitinh(), patients.getSdt(), patients.getDiachi(), patients.getEmail(), patients.getBenh(), patients.getIdp());
		return "redirect:/qlbenhnhan";		
	}
	@RequestMapping("/deletebenhnhan/{idp}")
	public String deleteby(Model model , @PathVariable("idp") int idp) {
		int delete = patientsMapper.deletebyidp(idp);
		return "redirect:/qlbenhnhan";
	}
	@GetMapping("/addBenhNhan")
	public String showadd() {
		return "addPatient";

	}
	@PostMapping("/saveBenhNhan")
	public String addmedical(Model model, Patients patients, HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("checkuser");
		doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int getiddoc = doc.getIdd();
	    int save =  patientsMapper.addBenhNhan(patients.getHotenbenhnhan(), patients.getNamsinh(), patients.getGioitinh(), patients.getSdt(), patients.getDiachi(), patients.getEmail(), getiddoc, patients.getBenh());
		return "redirect:/qlbenhnhan";
	}
}
