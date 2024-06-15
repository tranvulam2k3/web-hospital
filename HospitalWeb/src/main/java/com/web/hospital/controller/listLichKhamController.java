package com.web.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hospital.mapper.dbo.bookingMapper;
import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.Account;
import com.web.hospital.model.MedicalVisits;
import com.web.hospital.model.booking;
import com.web.hospital.model.doctor;

import jakarta.servlet.http.HttpSession;

@Controller
public class listLichKhamController {

	@Autowired
	doctorMapper doctorMapper;
	
	@Autowired
	bookingMapper bookingMapper;
	
	@GetMapping("/qllich")
	public String qllich(Model model ,HttpSession session, doctor doctor) {
	    Account loggedInUser = (Account) session.getAttribute("checkuser");
	    doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int getiddoc = doc.getIdd();
	    System.out.println(getiddoc);
		List<booking> listBooking = bookingMapper.listBookingByidD(getiddoc);
		model.addAttribute("list", listBooking);
		return "qllich";
	}
	@GetMapping("/examination/{stt}")
	public String edit(Model model, @PathVariable("stt") int stt) {
		booking list = bookingMapper.findbystt(stt); 
		model.addAttribute("list", list);
		return"addhoso";
	}

	@RequestMapping("/deletelich/{stt}")
	public String deleteby(Model model , @PathVariable("stt") int stt) {
		int delete = bookingMapper.deletebyStt(stt);
		return "redirect:/qllich";
	}
	@GetMapping("/addBook")
	public String showadd() {
		return "addBooking";

	}
	@PostMapping("/saveBooking")
	public String addmedical(Model model, booking booking, HttpSession session) {
		Account loggedInUser = (Account) session.getAttribute("account");
		doctor doc = doctorMapper.getiddByusername(loggedInUser.getUsername());
	    int maBS = doc.getIdd();
	    String getnameDoc = doc.getHotenbacsi();
		int gia = doc.getMount();
		int saveToDB = bookingMapper.save(booking.getHotenbenhnhan(),
				booking.getNamsinh(),
				booking.getGioitinh(),
				booking.getSdt(),
				booking.getDiachi(),
				booking.getEmail(),
				getnameDoc,
				booking.getLoinhan(),
				maBS,
				gia,
				booking.getDay(),
				booking.getId() );
		return "redirect:/qllich";
	}
}
