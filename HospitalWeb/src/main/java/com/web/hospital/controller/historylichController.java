package com.web.hospital.controller;

import com.web.hospital.model.Account;
import com.web.hospital.model.historylichkham;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.web.hospital.mapper.dbo.historylichkhamMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class historylichController {

    @Autowired
    historylichkhamMapper historylichkhamMapper;

    @GetMapping("lich-su-kham")
    public String historylich(Model model , HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        int id = account.getId();
        List<historylichkham> listHistoryByidD = historylichkhamMapper.checkHistoryByID(id);
        model.addAttribute("listHistoryByidD", listHistoryByidD);
        return "historyKham";
    }
}
