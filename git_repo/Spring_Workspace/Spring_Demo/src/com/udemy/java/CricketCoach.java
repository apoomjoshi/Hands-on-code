/**
 * 
 */
package com.udemy.java;

/**
 * @author admin
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach : No arg constructor");
	}

	//Serrter method for injecting dependencies
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside settermethod : setFortumeService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Workout daily 45 mins for cricket";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
