package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}


/*	 1. inside this HappyFortuneService class 
 * 		- we have 1 return with 1 method 
 * 
 * 
 * */
 