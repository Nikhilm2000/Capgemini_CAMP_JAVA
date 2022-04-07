package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.User;

@Controller
@RequestMapping("/new")
public class UserController {
	
	@RequestMapping(method = RequestMethod.POST)
	public String showNewUserPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "Index";
	}
	@RequestMapping(method = RequestMethod.POST)
	ModelAndView register(@ModelAttribute User user) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("user",user);
		return mav;
		
	}
}