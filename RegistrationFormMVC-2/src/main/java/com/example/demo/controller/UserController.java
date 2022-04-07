package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;

@Controller
@RequestMapping(value = "/register")
public class UserController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Model model) {
        User user = new User();
        model.addAttribute("regForm", user);
        return "Register";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView processRegistration(@ModelAttribute User user ) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("RegistrationSuccessful");
        mav.addObject("regForm",user);
        return mav;
    }
}