package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.AccountMapper;
import com.web.hospital.model.Account;

import jakarta.servlet.http.HttpSession;

@Controller
public class accountAdminController {
	
	@Autowired
	AccountMapper accountMapper;

	@GetMapping("accountlist")
	public String accountList(Model model) {
		List<Account> list = accountMapper.selectAllAccount();
		model.addAttribute("list", list);
		return "qlaccount";
	}
	
	@GetMapping("/editaccount/{id}")
	public String edit(Model model, @PathVariable("id") int id) {
		Account list = accountMapper.findbyidacc(id);
		model.addAttribute("list", list);
		return"editAccount";
	}

	@PostMapping("/updateaccount")
	public String update(Model model, Account account) {
		int update = accountMapper.updateacc(account.getUsername(), account.getPassword(), account.getRole(), account.getName(), account.getId());
		return "redirect:/accountlist";		
	}

	@RequestMapping("/deleteaccount/{id}")
	public String deletebyID(Model model , @PathVariable("id") int id) {
		int delete = accountMapper.deletebyidacc(id);
		return "redirect:/accountlist";
	}

	@GetMapping("/acctaikhoanmoi")
	public String showadd() {
		return "addAccount";

	}
	@PostMapping("/saveaccount")
	public String addmedical(Model model, Account account, HttpSession session) {
		int add = accountMapper.addacc(account.getUsername(), account.getPassword(), account.getRole(), account.getName());
		return "redirect:/accountlist";
	}

}
