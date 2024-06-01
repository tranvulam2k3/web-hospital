package com.web.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.hospital.mapper.dbo.AccountMapper;
import com.web.hospital.model.Account;

import jakarta.servlet.http.HttpSession;

@Controller
public class loginController {
	
	@Autowired
	AccountMapper accountMapper;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("checkuser");
		return"redirect:/home";
	}
	
	@PostMapping("/checkLogin")
	public String checkLogin(Model model, @ModelAttribute("Account") Account account,HttpSession session) {
		Account checkuser = accountMapper.checkLogin(account.getUsername(), account.getPassword());
		if(checkuser == null) {
			model.addAttribute("messErorr", "*Sai tên đăng nhập hoặc mật khẩu !");
			return "login";
		}else if(account.getUsername().equals("admin")){
			return "admin";
		}else {
			session.setAttribute("checkuser", checkuser);
			session.setAttribute("sessionName", checkuser.getName());
			session.setAttribute("sessionRole", checkuser.getRole());
//			session.setMaxInactiveInterval(5000);
			return "redirect:/home";
		}
	}
}
