package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.historygiaodichMapper;
import com.web.hospital.model.historygiaodich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class searchAdminController {

    @Autowired
    historygiaodichMapper historygiaodichMapper;

    @GetMapping("/search-from-admin")
    public String searchFromAdmin(Model model, historygiaodich historygiaodich) {
        List<historygiaodich> search = historygiaodichMapper.getallbyHoten(historygiaodich.getHoten());
        model.addAttribute("listHistoryByidD", search);
        return "qlHoaDon";
    }
}
