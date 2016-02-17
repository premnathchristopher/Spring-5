package com.mindfire.carreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mindfire.carreview.DTO.ReviewDTO;
import com.mindfire.carreview.domain.Review;
import com.mindfire.carreview.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	public ReviewRepository reviewRepository;

	public String addReview(ReviewDTO dto, Model model) {
		Review newReview = new Review();
		newReview.setCar_id(dto.getCar_id());
		newReview.setUser_id(dto.getUser_id());
		newReview.setTitle(dto.getTitle());
		newReview.setReview(dto.getReview());
		newReview.setRating(dto.getRating());

		Review check = reviewRepository.save(newReview);
		if (check.equals(null)) {
			return "write";
		} else {
			return "result";
		}
	}

}
