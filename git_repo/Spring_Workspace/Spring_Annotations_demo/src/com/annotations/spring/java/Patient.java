package com.annotations.spring.java;

import org.springframework.stereotype.Component;

@Component
public class Patient {

	String name;
	Address address;
	int ph_num;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setPh_num(int ph_num) {
		this.ph_num = ph_num;
	}
	
	
}
