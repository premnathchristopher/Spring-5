package com.mindfire.carreview.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.carreview.domain.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Long> {
	

	public List<CarDetails> findByDescription(String description);
	public List<CarDetails> findByLaunchdate(Date launchdate);
	public List<CarDetails> findByEngine(String engine);

}
