package com.mindfire.carreview.DTO;

public class AddCarDTO {
	private Long car_id;
	private String brand;
	private String model;
	private Double price;
	
	public AddCarDTO(){
		
	}
	
	public AddCarDTO(String brand, String model, Double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	public Long getCar_id() {
		return car_id;
	}
	public void setCar_id(Long car_id) {
		this.car_id = car_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
