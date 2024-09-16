package com.bookMoment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookMoment.dto.MainDTO;
import com.bookMoment.service.MainService;

@Controller
public class MainContoller {
	
	@Autowired
	MainService mainService;

	@GetMapping("/")
	public String mainView(Model model) {
		 List<MainDTO> resultList = mainService.test();
		System.out.println(resultList);
		
		model.addAttribute("result", resultList);
		
		return "index";
	}
}
