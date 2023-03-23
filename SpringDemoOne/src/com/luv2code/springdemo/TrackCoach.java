package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It" + fortuneService.getFortune();
	}


}


/*	1. This is the sub class of main obj 
 * 
 * 	2. we @Override it because so we can return the output-
 * 		-related to the class ex TrackCoach comment 
 *
 *	3. When we made the fortune service looks like our 
 *		-sub classes didn't like it so eclipse 
 *		- recomemded we also @Override it with thier method
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */