package com.annotations.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		TennisCoach coach = context.getBean("tennisCoach",TennisCoach.class);
		
		TennisCoach newCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		Boolean result=(coach == newCoach);
	
		//call methods
		System.out.println("are both Beans equal = "+result);
		
		System.out.println(coach);
		System.out.println(newCoach);
		//cloase context
		context.close();
	}

}
