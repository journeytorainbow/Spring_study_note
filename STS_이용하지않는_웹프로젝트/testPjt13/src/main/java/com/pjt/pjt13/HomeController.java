package com.pjt.pjt13;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		System.out.println("-- home() 메소드 호출 --");
		
		model.addAttribute("key", "value");
		return "home"; // home.jsp
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		System.out.println("-- login() 메소드 호출 --");
		
		model.addAttribute("key", "value");
		return "login"; // login.jsp
	}
}