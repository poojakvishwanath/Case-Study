package com.cg.ServiceUser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.UserDetails;

@RestController

public class UserController {

	@RequestMapping(value = "/home")
	private ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/Login")
	private ModelAndView LoginDetails() {
		return new ModelAndView("LoginForm", "login", new Login());
	}
	
	@RequestMapping(value="/carService")
	private ModelAndView serviceDetails() {
		
		return new ModelAndView("ServiceDetails", "login", new UserDetails());
	}
	
}
