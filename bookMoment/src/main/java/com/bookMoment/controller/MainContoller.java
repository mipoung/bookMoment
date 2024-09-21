package com.bookMoment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookMoment.dto.MainDTO;
import com.bookMoment.dto.UserDTO;
import com.bookMoment.service.MainService;
import com.bookMoment.service.UserService;

@Controller
public class MainContoller {
	
	@Autowired
	MainService mainService;
	
	@Autowired
	UserService userService;

	@GetMapping("/")
	public String mainView(Model model) {
		List<UserDTO> userInfo = userService.selectAllUserInfo();
		
		//List<MainDTO> resultList = mainService.test(); // 아직 DB 생성 전이라 DB 미생성시 오류 날 수 있음, 오류 시 주석처리 후 실행
		System.out.println(userInfo);
		
		model.addAttribute("result", userInfo);
		
		return "index";
	}
}
