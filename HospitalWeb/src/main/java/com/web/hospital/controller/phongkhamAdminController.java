package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.phongkhamMapper;
import com.web.hospital.model.khoa;
import com.web.hospital.model.phongkham;

import jakarta.servlet.http.HttpSession;

@Controller
public class phongkhamAdminController {

	
	@Autowired
	phongkhamMapper phongkhamMapper;
	
	@GetMapping("/clinic")
	public String phongkham(Model model) {
		List<phongkham> list = phongkhamMapper.selectallpk();
		model.addAttribute("list", list);
		return "qlphongkham";
	}
	@GetMapping("/editphongkham/{id}")
	public String edit(Model model, @PathVariable("id") int id) {
		phongkham list = phongkhamMapper.findbyidpk(id);
		model.addAttribute("list", list);
		return"editPhongKham";
	}
	@PostMapping("/updatePhong")
	public String update(Model model, phongkham phongkham) {
		int update = phongkhamMapper.updatepk(phongkham.getTenPhongKham(),phongkham.getDiaChi(), phongkham.getSoDienThoai(), phongkham.getGhiChu(), phongkham.getId());
		return "redirect:/clinic";		
	}
	@RequestMapping("/deletephongkham/{id}")
	public String deletebyID(Model model , @PathVariable("id") int id) {
		int delete = phongkhamMapper.deletebyidpk(id);
		return "redirect:/clinic";
	}
	@GetMapping("/addPhongKham")
	public String showadd() {
		return "addPhongKham";

	}
	@PostMapping("/addphong")
	public String addmedical(Model model,phongkham phongkham) {
		int add = phongkhamMapper.addpk(phongkham.getTenPhongKham(),phongkham.getDiaChi(), phongkham.getSoDienThoai(), phongkham.getGhiChu());
		return "redirect:/clinic";
	}
}
