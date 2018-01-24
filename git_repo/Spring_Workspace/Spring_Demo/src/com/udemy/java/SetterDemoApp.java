package com.udemy.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring container
		CricketCoach thecoach= context.getBean("myCricketCoach", CricketCoach.class);
			
		//call methods
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getEmailAddress());
		System.out.println(thecoach.getTeam());
		
		context.close();
	}

}
