/**
 * 
 */
package com.udemy.java;

/**
 * @author admin
 *
 */
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	 public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Workout daily 30 mins for Baseball";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
