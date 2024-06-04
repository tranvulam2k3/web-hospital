package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.mapper.dbo.khoaMapper;
import com.web.hospital.model.Account;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.hospital.model.doctor;
import com.web.hospital.mapper.dbo.khoaMapper;

import java.util.List;

@Controller
public class doctorCategoryController {

    @Autowired
   khoaMapper khoaMapper;

    @Autowired
    doctorMapper doctorMapper;

    @GetMapping("chuyenkhoa/{makhoa}")
    public String chuyenkhoa(Model model, @PathVariable("makhoa") int makhoa, HttpSession session) {
        Account loggedInUser = (Account) session.getAttribute("checkuser");
        List<doctor> listDoctor = doctorMapper.getdoctorbymakhoa(makhoa);
        model.addAttribute("listDoctor",listDoctor);
        if (loggedInUser == null) {
            return "doctorCategory";
        }else{
            model.addAttribute("RoleSession", loggedInUser.getRole());
        }
        return "doctorCategory";
    }
}
