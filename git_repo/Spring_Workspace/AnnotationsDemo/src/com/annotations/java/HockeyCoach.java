package com.annotations.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Autowired
	@Qualifier("wishFortuneService")
	public FortuneService fortuneService;
	
	@Value("${sport.team}")
	public String team ;
	
	public String getTeam() {
		return team;
	}

	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hockey Workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
