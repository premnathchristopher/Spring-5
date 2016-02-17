package com.mindfire.carreview.DTO;

import java.sql.Date;

public class AddDetailsDTO {

	private Long cardetails_id;
	private Long car_id;
	private String description;
	private Date launchdate;
	private String engine;
	private String power;
	private Integer doors;
	private Integer seats;
	
	public AddDetailsDTO() {
		
	}
	
	public AddDetailsDTO (Long car_id, String description,Date launchdate, String engine, String power,Integer doors, Integer seats){
		this.car_id=car_id;
		this.description=description;
		this.launchdate=launchdate;
		this.engine=engine;
		this.power=power;
		this.doors=doors;
		this.seats=seats;
		
	}
	public Long getCardetails_id() {
		return cardetails_id;
	}
	public void setCardetails_id(Long cardetails_id) {
		this.cardetails_id = cardetails_id;
	}
	public Long getCar_id() {
		return car_id;
	}
	public void setCar_id(Long car_id) {
		this.car_id = car_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLaunchdate() {
		return launchdate;
	}
	public void setLaunchdate(Date launchdate) {
		this.launchdate = launchdate;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Integer getDoors() {
		return doors;
	}
	public void setDoors(Integer doors) {
		this.doors = doors;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
}
