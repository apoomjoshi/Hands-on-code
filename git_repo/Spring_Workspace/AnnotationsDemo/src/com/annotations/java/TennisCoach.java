package com.annotations.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring Annotation for Inversion of control 
//Bean @component ("Bean_id") , Here if we do not mention bean id then Spring will automatically create bean id with same name and start letter with lower case
@Component 
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Value("$(sport.team)")
	public String team;


//	// 4. Field DI with @Autowired Annotation
//	//Qualifier("Ban_id") : which class's implementation to take
//	@Autowired
//	@Qualifier("happyFortuneService")
	public FortuneService fortuneService ;
	
	public TennisCoach() {
		super();
		System.out.println("Hey , You are @ Default Constructor");
	}

	@PostConstruct
	public void doStartUpstuff()
	{
		System.out.println("Inside do startup @PostConstruct");
	}
	
	@PreDestroy
	public void doCleanupStuff()
	{
		System.out.println("Inside doCleanupstuff @ PreDestroy");
	}
	
	//3. Constructor injection with @Autowired annotation
	@Autowired
	public TennisCoach(@Qualifier("wishFortuneService")FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		System.out.println("Inside Constructor");
	}

//	//2. Setter method DI with @Autowired annotation.
//	// If constructor and setter both are Autowired then aslways setter will override Constructor DI .
//	@Autowired
//	@Qualifier("happyFortuneService")
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("Hey You are @ Setter method");
//	}

	
//	//3. Any Other method name other than setter method DI
//	@Autowired
//	public void checkMethodDI(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("DI with any other method name");
//	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 10kms daily";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return team;
	}

	
}
	