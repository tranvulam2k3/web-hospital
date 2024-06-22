package com.web.hospital.controller;


import com.web.hospital.mapper.dbo.historygiaodichMapper;
import com.web.hospital.model.Account;
import com.web.hospital.model.historygiaodich;
import com.web.hospital.model.thongtincanhan;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class qlHoaDonController {
    @Autowired
    historygiaodichMapper historygiaodichMapper;

    @GetMapping("listhoadon")
    public String QLThanhToan(Model model , historygiaodich historygiaodich) {
                List<historygiaodich> listHistoryByidD = historygiaodichMapper.getall();
        model.addAttribute("listHistoryByidD", listHistoryByidD);
        return "qlHoaDon";
    }
}
