package com.annotations.spring.java;

import org.springframework.stereotype.Component;

@Component
public class Hospital {

	String hosp_name;
	Patient patient;
	Address address;
	
	
	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
