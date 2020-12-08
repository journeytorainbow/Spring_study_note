package com.pjt.pjt12;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Login {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("loginKey", "loginValue");
		
		return "login"; // login.jsp
	}
}