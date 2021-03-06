package com.mindfire.carreview.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.AddCarDTO;
import com.mindfire.carreview.service.CarService;

@Controller
public class AdminController {
	@Autowired
	private CarService carService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String review(Model model) {
		return "admin";
	}

	@RequestMapping(value = "addcar", method = RequestMethod.GET)
	public String getaddcars(@ModelAttribute("addcar") AddCarDTO dto, Model model) {
		model.addAttribute("addcar", new AddCarDTO());
		return "addcar";
	}

	@RequestMapping(value = "addCars", method = RequestMethod.POST)
	public String postaddcars(@ModelAttribute("addcar") AddCarDTO dto, Model model) {
		model.addAttribute("addcar", new AddCarDTO());
		return carService.addNewCars(dto, model);
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

}
