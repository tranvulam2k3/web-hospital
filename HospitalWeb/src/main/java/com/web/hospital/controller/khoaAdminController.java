package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.khoaMapper;
import com.web.hospital.model.Account;
import com.web.hospital.model.MedicalVisits;
import com.web.hospital.model.doctor;
import com.web.hospital.model.khoa;

import jakarta.servlet.http.HttpSession;

@Controller
public class khoaAdminController {
	
	@Autowired
	khoaMapper khoaMapper;
	
	@GetMapping("specialist")
	public String khoaList(Model model) {
		List<khoa> list = khoaMapper.getKhoa();
		model.addAttribute("list", list);
		return "qlchuyenkhoa";
	}
	@GetMapping("/editkhoa/{makhoa}")
	public String edit(Model model, @PathVariable("makhoa") int makhoa) {
		khoa list = khoaMapper.findbymaKhoa(makhoa);
		model.addAttribute("list", list);
		return"editChuyenKhoa";
	}
	@PostMapping("/updatechuyenkhoa")
	public String update(Model model, khoa khoa) {
		int update = khoaMapper.updateKhoa(khoa.getTenkhoa(), khoa.getTruongKhoa(), khoa.getMakhoa());
		return "redirect:/specialist";		
	}
	@RequestMapping("/deletekhoa/{makhoa}")
	public String deletebyID(Model model , @PathVariable("makhoa") int makhoa) {
		int delete = khoaMapper.deletebymakhoa(makhoa);
		return "redirect:/specialist";
	}
	@GetMapping("/addChuyenKhoa")
	public String showadd() {
		return "addChuyenKhoa";

	}
	@PostMapping("/addchuyenkhoa")
	public String addmedical(Model model, khoa khoa, HttpSession session) {
		int add = khoaMapper.addKhoa(khoa.getTenkhoa(), khoa.getTruongKhoa(), khoa.getMakhoa());
		return "redirect:/specialist";
	}
}
