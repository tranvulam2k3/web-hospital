package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.historygiaodichMapper;
import com.web.hospital.model.historygiaodich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class sortByDayController {

    @Autowired
    historygiaodichMapper historygiaodichMapper;

    @GetMapping("/sort-by-date")
    public String sortByDate(Model model, historygiaodich historygiaodich) {
        if(historygiaodich.getDaysort().equals("desc")){
            List<historygiaodich> newday = historygiaodichMapper.sortNewDay();
            model.addAttribute("listHistoryByidD", newday);
        }else{
            List<historygiaodich> lastDay = historygiaodichMapper.sortLastDay();
            model.addAttribute("listHistoryByidD", lastDay);
        }
        return "qlHoaDon";
    }
}
