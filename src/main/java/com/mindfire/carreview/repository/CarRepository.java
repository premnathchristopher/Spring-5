package com.mindfire.carreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.carreview.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	public List<Car> findByBrand(String brand);
	

	public List<Car> findByModel(String model);

	public List<Car> findByPrice(Double price);

}
