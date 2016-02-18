package com.mindfire.carreview.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.UserRegistrationDto;
import com.mindfire.carreview.DTO.UserSigninDto;
import com.mindfire.carreview.service.UserDetailsService;

@Controller
public class SignUpController {
	@Autowired
	private UserDetailsService userDetailsService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("user")  UserRegistrationDto dto, BindingResult result,Model model) {
		System.out.println("Input has errors" + result.hasErrors());
		if(result.hasErrors()){
			return "signup";
		}
		return userDetailsService.createUserDetails(dto, model);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") UserSigninDto dto, Model model, HttpSession session) {
		return userDetailsService.UserLogin(dto, model, session);
	}
	
	@RequestMapping(value ="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session ,Model model){
		session.invalidate();
		return "home";
		
	}

}