package com.practice.java;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//REtrive a bean from Spring Containe
		Employee employee=  context.getBean("emp", Employee.class);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getAddress().home_num);
		System.out.println(employee.getAddress().city);
		System.out.println(employee.getAddress().state);
		System.out.println(employee.getAddress().pincode);
		List<String> email= employee.getEmail();
	    Iterator<String> itr= email.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		
		
		
	}

}
