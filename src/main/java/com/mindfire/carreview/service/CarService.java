package com.mindfire.carreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mindfire.carreview.DTO.AddCarDTO;
import com.mindfire.carreview.domain.Car;
import com.mindfire.carreview.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	public CarRepository carRepository;

	public String addNewCars(AddCarDTO dto, Model model) {
		Car newCar = new Car();
		newCar.setBrand(dto.getBrand());
		newCar.setModel(dto.getModel());
		newCar.setPrice(dto.getPrice());
		newCar.setDescription(dto.getDescription());

		Car check = carRepository.save(newCar);
		if (check.equals(null)) {
			return "redirect:addcar";
		} else {
			return "result";
		}
	}

}
