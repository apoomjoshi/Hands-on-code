/**
 * 
 */
package com.udemy.java;

/**
 * @author admin
 *
 */
public class myApp {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is a simple approach 
		Coach theCoach ;
		
		//Create Object
		theCoach = new TrackCoach();
		//theCoach = new BaseballCoach();
		//theCoach=new CricketCoach();
		 
		//Use Object
		System.out.println(theCoach.getDailyWorkout());
	}

}
