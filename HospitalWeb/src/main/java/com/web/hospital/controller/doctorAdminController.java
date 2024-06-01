package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.doctor;
import com.web.hospital.model.khoa;

import jakarta.servlet.http.HttpSession;

@Controller
public class doctorAdminController {

	@Autowired 
	doctorMapper doctorMapper;
	
	@GetMapping("doctorlist")
	public String doctorList(Model model) {
		List<doctor> list = doctorMapper.getdoctor();
		model.addAttribute("list", list);
		return "qlbs";
	}
	@GetMapping("/editdoc/{idd}")
	public String edit(Model model, @PathVariable("idd") int idd) {
		doctor list = doctorMapper.findbyidd(idd);
		model.addAttribute("list", list);
		return"editDoctor";
	}
	@PostMapping("/updatadoc")
	public String update(Model model, doctor doc) {
		int update = doctorMapper.updatedoc(doc.getHotenbacsi(), doc.getNamsinh(), doc.getGioitinh(), doc.getSdt(), doc.getEmail(), doc.getUsername(), doc.getIdd());
		return "redirect:/doctorlist";		
	}
	@RequestMapping("/deletedoc/{idd}")
	public String deletebyID(Model model , @PathVariable("idd") int idd) {
		int delete = doctorMapper.deletebyidd(idd);
		return "redirect:/doctorlist";
	}
	@GetMapping("/addBacsi")
	public String showadd() {
		return "addDoctor";

	}
	@PostMapping("/saveDoc")
	public String saveDoc(Model model, doctor doc, HttpSession session) {
		int add = doctorMapper.adddoc(doc.getHotenbacsi(), doc.getNamsinh()	, doc.getGioitinh(), doc.getSdt(), doc.getEmail(), doc.getUsername());
		return "redirect:/doctorlist";
	}
}
