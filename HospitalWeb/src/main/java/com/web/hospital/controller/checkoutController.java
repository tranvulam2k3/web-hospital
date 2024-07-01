package com.web.hospital.controller;

import com.web.hospital.model.Account;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.hospital.mapper.dbo.bookingMapper;
import com.web.hospital.model.booking;
import com.web.hospital.model.doctor;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class checkoutController {

	@Autowired 
	bookingMapper bookingMapper;

	@PostMapping("/check-timeslot")
	@ResponseBody
	public Map<String, String> checkTimeSlot(@ModelAttribute booking bookingInfo, HttpServletRequest request) {
		Map<String, String> response = new HashMap<>();

		HttpSession session = request.getSession();
		doctor doc = (doctor) session.getAttribute("doctor");
		int maBS = doc.getIdd();

		// Kiểm tra mốc thời gian đã đặt lịch
		List<String> checkSlot = bookingMapper.checkSlottime(bookingInfo.getDay(),maBS);
		for (String checktimeSlot : checkSlot) {
			if (checktimeSlot.equals(bookingInfo.getTimeslot())) {
				response.put("errorSlot", "Mốc thời gian này đã được đặt lịch. Vui lòng chọn mốc thời gian khác.");
				return response;
			}
		}

		return response;
	}

	@PostMapping("/checkout")
	public String processBooking(@ModelAttribute booking bookingInfo, Model model, HttpServletRequest request) {
	// Thêm thông tin booking vào model để truyền sang view checkout
	model.addAttribute("inf", bookingInfo);

//	List<String> checkSlot = bookingMapper.checkSlottime(bookingInfo.getDay());
//	for(String checktimeSlot : checkSlot){
//		if(checktimeSlot.equals(bookingInfo.getTimeslot())==true){
//			model.addAttribute("erorrSlot","Gio dat bi trung");
//			return "redirect:/booking/{idd}";
//		}
//	}
	//Save thong tin vào session
	HttpSession session = request.getSession();
	session.setAttribute("bookingInfo", bookingInfo);

	return "checkout"; // Trả về trang checkout.html
}

	@GetMapping("/success")
	public String success(HttpServletRequest request, Model model, booking booking) {
		HttpSession session = request.getSession();

		booking bookingInfo = (booking) session.getAttribute("bookingInfo");
		doctor doc = (doctor) session.getAttribute("doctor");
		Account account = (Account) session.getAttribute("account");

		int maBS = doc.getIdd();
		int idphong = doc.getIdphong();
		int id =  account.getId();
		LocalTime timenow = LocalTime.now();
		booking.setThoigiandat(Time.valueOf(timenow).toLocalTime());
		System.out.println(booking.getThoigiandat());
		int saveToDB = bookingMapper.save(bookingInfo.getHotenbenhnhan(),
				bookingInfo.getNamsinh(),
				bookingInfo.getGioitinh(),
				bookingInfo.getSdt(),
				bookingInfo.getDiachi(),
				bookingInfo.getEmail(),
				bookingInfo.getHotenbacsi(),
				bookingInfo.getLoinhan(),
				maBS,
				bookingInfo.getMount(),
				bookingInfo.getDay(),
				id,
				idphong,
                Time.valueOf(timenow).toLocalTime(),
				bookingInfo.getTimeslot());

		return "success";
	}
}
