package com.web.hospital.controller;

import com.web.hospital.mapper.dbo.bookingMapper;
import com.web.hospital.mapper.dbo.historylichkhamMapper;
import com.web.hospital.mapper.dbo.hosoMapper;
import com.web.hospital.model.booking;
import com.web.hospital.model.hoso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.web.hospital.mapper.dbo.bookingMapper;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hosoController {

//    @Autowired
//    private hosoMapper hosoMapper;
//
//    @Autowired
//    private bookingMapper bookingMapper;
//
//    @Autowired
//    private historylichkhamMapper historylichkhamMapper;
//
//    @PostMapping("/updatebooking")
//    public String update( hoso hoso , @RequestParam("stt") int stt) {
//        int update = hosoMapper.insertHoso(hoso);
//        int inserttoHistory = historylichkhamMapper.insertHistory(stt,"Đã khám bệnh");
//        int delete = bookingMapper.deletebyStt(stt);
//        return "redirect:/qllich";
//    }
}
