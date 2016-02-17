package com.mindfire.carreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.ReviewDTO;
import com.mindfire.carreview.service.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	private ReviewService reviewService;

	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String getReview(@ModelAttribute("reviews") ReviewDTO dto, Model model) {
		model.addAttribute("reviews", new ReviewDTO());
		return "write";
	}

	@RequestMapping(value = "userreview", method = RequestMethod.POST)
	public String postReview(@ModelAttribute("reviews") ReviewDTO dto, Model model) {
		model.addAttribute("reviews", new ReviewDTO());
		return reviewService.addReview(dto, model);
	}

}
