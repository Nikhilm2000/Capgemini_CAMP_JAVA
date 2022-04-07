package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
 
	UserService service;
    @RequestMapping(value = "/registered",method = RequestMethod.GET)
    public String viewRegistration(Model model){
		List<User> listUsers = service.listAll();
		model.addAttribute("listUsers", listUsers);
		return "RegistrationSuccessful";
	}
     
    @RequestMapping(value = "/register",method = RequestMethod.POST)
	public String processRegistration(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "Register";
	}
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		service.save(user);
		return "redirect:/RegistrationSuccessful";
	}
}