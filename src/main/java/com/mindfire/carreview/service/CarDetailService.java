package com.mindfire.carreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mindfire.carreview.DTO.AddDetailsDTO;
import com.mindfire.carreview.domain.CarDetails;
import com.mindfire.carreview.repository.CarDetailsRepository;

@Service
public class CarDetailService {
	@Autowired
	CarDetailsRepository carDetailsRepository;
	public String addDetails(AddDetailsDTO dto,Model model){
		CarDetails newDetail= new CarDetails();
		newDetail.setCar_id(dto.getCar_id());
		newDetail.setDescription(dto.getDescription());
		newDetail.setLaunchdate(dto.getLaunchdate());
		newDetail.setEngine(dto.getEngine());
		newDetail.setPower(dto.getPower());
		newDetail.setDoors(dto.getDoors());
		newDetail.setSeats(dto.getSeats());
		
		CarDetails check= carDetailsRepository.save(newDetail);
		if (check.equals(null)){
			return "redirect:addcarDetails";
		} else {
			return "result";
		}
	}

}
