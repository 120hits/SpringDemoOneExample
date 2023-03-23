package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//1
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		//2
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//3
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//2 private fields outputs for emailAddress & team
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
	
		
		//4 
		context.close();
		
		
		
	}	

}




/*	//1. Load the Spring Configure file 
 *	//retrieve Obj Bean from Spring Container 
 *	//call methods on the bean 
 *	//close the context 
 * 
 * 
 * 
 * 
 * 
 */