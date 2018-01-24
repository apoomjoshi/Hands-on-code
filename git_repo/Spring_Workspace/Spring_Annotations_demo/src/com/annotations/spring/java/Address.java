package com.annotations.spring.java;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	String hm_num;
	String city;
	
	
	public void setHm_num(String hm_num) {
		this.hm_num = hm_num;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
