package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.AccountMapper;
import com.web.hospital.mapper.dbo.thongtincanhanMapper;
import com.web.hospital.model.Account;
import com.web.hospital.model.thongtincanhan;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class profileController {

    @Autowired
    thongtincanhanMapper thongtincanhanmapper;

    @Autowired
    AccountMapper accountMapper;

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {
        Account loggedInUser = (Account) session.getAttribute("checkuser");
        String username = loggedInUser.getUsername();
        thongtincanhan getthongtin = thongtincanhanmapper.getthongtincanhanByUsername(username);
        model.addAttribute("profile", getthongtin);
        return "myprofile";
    }

    @PostMapping("/updateprofile")
    public String updateprofile(HttpSession session, thongtincanhan thongtincanhan,
                                @RequestParam("oldPassword") String oldPassword,
                                @RequestParam("newPassword") String newPassword,
                                @RequestParam("confirmPassword") String confirmPassword,
                                Model model) {
        Account loggedInUser = (Account) session.getAttribute("checkuser");
        String username = loggedInUser.getUsername();
        String pass = loggedInUser.getPassword();
        int updateinfor = thongtincanhanmapper.updataprofileByusername(thongtincanhan.getHoten(), thongtincanhan.getGioitinh(),
                thongtincanhan.getSdt(), thongtincanhan.getNgaysinh(), thongtincanhan.getEmail(),
                thongtincanhan.getDiachi(), username);
        if (oldPassword == "" && oldPassword.isEmpty() &&
                newPassword == "" && newPassword.isEmpty() &&
                confirmPassword == "" && confirmPassword.isEmpty()) {
            return "redirect:/home";
        } else {
            if (oldPassword.equals(pass) == true) {
                if (newPassword.equals(confirmPassword) == true) {
                    int updatePass = accountMapper.changePassword(newPassword, username);
                    loggedInUser.setPassword(newPassword);
                    session.setAttribute("checkuser", loggedInUser);

                } else {
                    model.addAttribute("error", "Mật khẩu xác nhận không khớp.");
                    thongtincanhan getthongtin = thongtincanhanmapper.getthongtincanhanByUsername(username);
                    model.addAttribute("profile", getthongtin);
                    return "myprofile";
                }
            } else {
                model.addAttribute("error", "Mật khẩu cũ không đúng");
                thongtincanhan getthongtin = thongtincanhanmapper.getthongtincanhanByUsername(username);
                model.addAttribute("profile", getthongtin);
                return "myprofile";
            }
        }
        return "redirect:/home";
    }

    //alo
}
