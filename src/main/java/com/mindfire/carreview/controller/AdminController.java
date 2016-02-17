package com.mindfire.carreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.AddCarDTO;
import com.mindfire.carreview.service.UserDetailsService;
@Controller
public class AdminController {
	@Autowired
	private UserDetailsService userDetailsService;

	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public String review(Model model) {
		return "admin";
	}
	
	@RequestMapping(value="/admin/cars",method = RequestMethod.GET)
	public String addcars(@ModelAttribute("addcar") AddCarDTO dto, Model model) {
		model.addAttribute(new AddCarDTO());
		return "addcar";
	}
	
	@RequestMapping(value="/admin/adddetails",method = RequestMethod.GET)
	public String adddetails(Model model) {
		return "adddetails";
	}
}
