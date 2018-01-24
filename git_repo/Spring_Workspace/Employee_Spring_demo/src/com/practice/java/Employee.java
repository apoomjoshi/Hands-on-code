package com.practice.java;

import java.util.List;

public class Employee {
	
	int id;
	String name;
	int age;
	Address address ;
	List<String> email;
	
	
	public Employee(int id, String name, int age, Address address, List<String> email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
