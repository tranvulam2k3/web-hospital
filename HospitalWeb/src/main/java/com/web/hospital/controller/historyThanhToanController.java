package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.historygiaodichMapper;
import com.web.hospital.model.Account;
import com.web.hospital.model.historygiaodich;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class historyThanhToanController {

    @Autowired
    historygiaodichMapper historygiaodichMapper;

    @GetMapping("lich-su-thanh-toan")
    public String historyThanhToan(Model model , HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        int id = account.getId();
        List<historygiaodich> listHistoryByidD = historygiaodichMapper.getallbyID(id);
        model.addAttribute("listHistoryByidD", listHistoryByidD);
        return "historyThanhToan";
    }
}
