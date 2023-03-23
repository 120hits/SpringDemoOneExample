package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configure file 
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		//retrieve bean from the spring container 
		//call the main obj aka Coach theCoach 
		//myCoach is the name 
			Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myBaseballCoach", Coach.class);
		
		//check to see they are the same bean 
		//set up a boolean variable result 
		//compare the obj references 
		
		boolean result = (theCoach == alphaCoach);
		
		//display the results //print out the results 
		System.out.println("\nPoiting to the same obj " + result);
		
		
		//print out the memory location 
		System.out.println("\nMemory location for theCoach" + theCoach);
		
		System.out.println("\nMemory location for alphaCoach" + alphaCoach);
		
		//close the context
		context.close();


	}

}
