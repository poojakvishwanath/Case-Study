package com.cg.ServiceUser.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ServiceUser.Exception.UserException;
import com.cg.ServiceUser.model.Login;
import com.cg.ServiceUser.model.Services;
import com.cg.ServiceUser.model.UserDetails;
import com.cg.ServiceUser.service.IService;

@RestController

public class UserController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	IService service;

	@RequestMapping("/home")
	private ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/Login")
	private ModelAndView loginDetails() {
		return new ModelAndView("LoginForm", "login", new Login());
	}

	@RequestMapping(value="/userPage")
	private ModelAndView userPage() {
		return new ModelAndView("userPage");
	}

	@RequestMapping(value="/carService") 
	private ModelAndView carService(){
		return new ModelAndView("userDetails", "login", new UserDetails() ); 
	}

	@RequestMapping(value="/serviceDetails") 
	private ModelAndView serviceDetails(@ModelAttribute("login") UserDetails details, BindingResult result) throws UserException{
		ModelAndView view=null;

		try { 
			if(details.getAccountName().equals(null)) {
				throw new UserException("Error occured, Try Again");
			} }catch (NullPointerException e) {
				throw new UserException("Error occured, Try Again"); }

		try { 
			if(details.getCarNumber().equals(null)) { 
				throw new UserException("Error occured, Try Again");
			} }catch (NullPointerException e) {
				throw new UserException("Error occured, Try Again"); 
			}

		try { 
			if(details.getValidityDate().equals(null)) {
				throw new UserException("Error occured, Try Again");
			} }catch (NullPointerException e) {
				throw new UserException("Error occured, Try Again"); 
			}


		try {
			
			if(result.hasErrors()) {
				view= new ModelAndView("userDetails", "login", new UserDetails());
			}
			UserDetails details1 = service.addServiceDetails(details);
			Services services = new Services();
			view=new ModelAndView("services", "login", new Services());
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		return view;
	}


	@RequestMapping(value="/modify")
	private ModelAndView modify() {
		return new ModelAndView("userUpdateForm","login",new Login());
	}



	@RequestMapping(value="modifyProfile")
	private ModelAndView updateDetails(@ModelAttribute("login") Login login) {
		Login login1 = service.getUserByID(login.getUserId());
		ModelAndView view = new ModelAndView("updateForm", "login", login1);
		return view;
	}



	@RequestMapping(value="updateProfile")
	private ModelAndView updateProfile(@ModelAttribute("login") Login login, BindingResult result) throws UserException {

		ModelAndView view = null;
		Login login1 = service.getUserByID(login.getUserId());
		if(login1==null) {
			throw new UserException("Wrong UserId");
		}
		if(login1.getUserId().equals(login.getUserId())){

			if(result.hasErrors()) {
				view= new ModelAndView("LoginForm" ,"login", new Login());
			}
			Login login2 = service.updateProfile(login);
			view= new ModelAndView("Success", "login", login2);
		}else {
			throw new UserException("UserId mismatch");
		}

		return view;	
	}

	@RequestMapping(value="view")
	private ModelAndView viewUserProfile() {
		return new ModelAndView("viewById", "login", new Login());
	}

	@RequestMapping(value="userView")
	private ModelAndView viewProfile(@ModelAttribute("login") Login login)throws UserException{
		Login login1= service.getUserByID(login.getUserId());
		if(login1==null) {
			throw new UserException("Wrong Login id");
		}
		ModelAndView view = new ModelAndView("viewProfile","login",login1);
		return view;
	}


	@RequestMapping(value="/createUser", method = RequestMethod.POST)
	public Login addNewUser(@Valid @RequestBody Login user) {
		return service.addNewUser(user);
	}


	@RequestMapping(value="/{userId}", method= RequestMethod.GET)
	public Login getUser(@PathVariable String userId){
		Login user = service.getUserByID(userId);
		return user;
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
