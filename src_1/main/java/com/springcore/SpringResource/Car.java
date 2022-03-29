package com.springcore.SpringResource;

import javax.annotation.Resource;

public class Car {

	private String company;
	private double price;
	private Engine engine;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	
	@Resource(name = "eng1")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
	
	
}
