package com.annotations.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApp {

	public static void main(String[] args) {
		// Load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get bean from spring container
		Coach coach = context.getBean("hockeyCoach",Coach.class);
		
		// call methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeam());
		
		
		//close context 
		context.close();

	}

}
