package com.example.demo.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {
	@GetMapping("/user")
	public String save(Model model) {
		User userobj = new User();
		userobj.setName("Nikhil M");
		userobj.setEmail("NikhilM@gmail.com");
		model.addAttribute("user", userobj);
		return "Main";
	}
}