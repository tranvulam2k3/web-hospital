package com.web.hospital.controller;

import com.web.hospital.model.Account;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.web.hospital.mapper.dbo.bookingMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.web.hospital.model.booking;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.web.hospital.mapper.dbo.historylichkhamMapper;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class checkBookingController {
    @Autowired
    private bookingMapper bookingMapper;

    @Autowired
    private historylichkhamMapper historylichkhamMapper;


    @GetMapping("/checkbooking")
    public String checkBooking(Model model, HttpSession session, booking booking) {
        Account account = (Account) session.getAttribute("account");
        int id = account.getId();
        List<booking> listBookingByidD = bookingMapper.checkBookingbyID(id);
        model.addAttribute("listBookingByidD", listBookingByidD);
        Map<Integer, Boolean> canCancelMap = new HashMap<>();
        for (booking listbooking : listBookingByidD) {
//          get thoi gian hien tai
            LocalTime timenow = LocalTime.now();
//          get thoi gian khi dat lich trong db
            LocalTime bookingtime = listbooking.getThoigiandat();
//          so sanh thoi gian hien tai vs thoi gian khi dat lich trong db
            Duration duration = Duration.between(bookingtime, timenow);
            //chuyen ve phut
            long minutesSinceBooking = duration.toMinutes();

            canCancelMap.put(listbooking.getStt(), minutesSinceBooking <= 15);
        }
        model.addAttribute("canCancelMap", canCancelMap);
        return "checkBooking";
    }

    @RequestMapping("/deletebooking/{stt}")
    public String deleteby(Model model, @PathVariable("stt") int stt) {
        int inserttoHistory = historylichkhamMapper.insertHistory(stt, "Đã hủy lịch");

        int delete = bookingMapper.deletebyStt(stt);
        return "redirect:/checkbooking";
    }

}
