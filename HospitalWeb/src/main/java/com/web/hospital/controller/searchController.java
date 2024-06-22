package com.web.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.hospital.mapper.dbo.doctorMapper;
import com.web.hospital.model.doctor;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class searchController {
	
	@Autowired
	doctorMapper doctorMapper;

	@GetMapping("/search")
	public String search(Model model, doctor doctor,@RequestParam(name = "offset",defaultValue =  "1") int offset,
												@RequestParam(name = "pagesize" , defaultValue = "6") int pagesize) {
		int sotrang = (offset - 1) * pagesize;
		System.out.println(doctor.getHotenbacsi());
		List<doctor> docSearch = doctorMapper.searchbyName(doctor.getHotenbacsi(),sotrang,pagesize);
		List<doctor> getallDoctor = doctorMapper.listSearchbyName(doctor.getHotenbacsi());

		if(docSearch.size() == 0) {
			return "404";
		}else {
			int trang;
			if(getallDoctor.size() % 2 != 0) {
				trang=getallDoctor.size()/pagesize+1;
			}else {
				trang=getallDoctor.size()/pagesize ;
			}
			model.addAttribute("docSearch", docSearch);
			model.addAttribute("name", doctor.getHotenbacsi());
			model.addAttribute("trang", trang);
			model.addAttribute("offset", offset);
			return "information";
		}	
	}

}
