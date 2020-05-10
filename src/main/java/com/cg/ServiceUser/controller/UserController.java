package com.cg.ServiceUser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.Services;
import com.cg.ServiceUser.model.UserDetails;

@RestController

public class UserController {

	@RequestMapping("/")
	private String hi() {
		return "Hi";
	}
	
	@RequestMapping("/home")
	private ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/Login")
	private ModelAndView loginDetails() {
		return new ModelAndView("LoginForm", "login", new Login());
	}
	
	@RequestMapping(value="/carService")
	private ModelAndView userDetails() {
		
		return new ModelAndView("userDetails", "login", new UserDetails());
	}
	@RequestMapping(value="/serviceDetails")
	private ModelAndView serviceDetais() {
		return new ModelAndView("services", "login", new Services());
		
	}
	
}
