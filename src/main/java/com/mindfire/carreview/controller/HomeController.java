package com.mindfire.carreview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.UserRegistrationDto;
import com.mindfire.carreview.DTO.UserSigninDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login(@ModelAttribute("login") UserSigninDto dto, Model model) {
		model.addAttribute(new UserRegistrationDto());
		return "login";
	}
	
	@RequestMapping(value="/signup",method = RequestMethod.GET)
	public String signup(@ModelAttribute("user") UserRegistrationDto dto, Model model) {
		model.addAttribute(new UserRegistrationDto());
		return "signup";
	}
	
	
	
	@RequestMapping(value="/news",method = RequestMethod.GET)
	public String news(Model model) {
		return "news";
	}
	
	@RequestMapping(value="/reviews",method = RequestMethod.GET)
	public String reviews(Model model) {
		return "reviews";
	}
	
	@RequestMapping(value="/topbrands",method = RequestMethod.GET)
	public String topbrands(Model model) {
		return "topbrands";
	}
	
	@RequestMapping(value="/gallery",method = RequestMethod.GET)
	public String gallery(Model model) {
		return "gallery";
	}
	
	@RequestMapping(value="/write",method = RequestMethod.GET)
	public String review(Model model) {
		return "write";
	}
	
	
	
}
