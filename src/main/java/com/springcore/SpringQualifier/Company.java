package com.springcore.SpringQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	private String name;
	private String address;
	private Employee emp;
	

	/*
	 * public Company(String name, String address, Employee emp) { super();
	 * this.name = name; this.address = address; this.emp = emp; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmp() {
		return emp;
	}

	@Autowired
	@Qualifier("emp")
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	
	
	
	
}
