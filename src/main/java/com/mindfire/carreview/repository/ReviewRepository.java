package com.mindfire.carreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfire.carreview.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	@Override
	List<Review> findAll();

}
