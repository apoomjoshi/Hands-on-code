package com.udemy.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//REtrive a bean from Spring Container
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		//Call methods on Bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
 