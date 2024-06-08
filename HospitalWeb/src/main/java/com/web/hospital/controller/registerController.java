package com.web.hospital.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.hospital.mapper.dbo.AccountMapper;
import com.web.hospital.model.Account;

@Controller
public class registerController {
	
	@Autowired 
	AccountMapper accountMapper;
	
	@GetMapping("/register")
	public String register(Account account, Model model) {
		return "register";
	}
	
	@PostMapping("/checkRegister")
	public String check(Model model, @Valid Account account, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "register";
		}else {
			if(account.getPassword().equals(account.getRepassword()) == false) {
				model.addAttribute("messPass", "*Password không trùng khớp !");
				return "register";
			}else {
				Account checkuser = accountMapper.checkuser(account.getUsername());
				if(checkuser == null) {
					int dangki = accountMapper.register(account.getUsername(), account.getPassword(), account.getName());
					return "login";
				}
			}
			model.addAttribute("messUser", "*Tên đăng nhập đã tồn tại !");
			return "register";
		}
	}
}
