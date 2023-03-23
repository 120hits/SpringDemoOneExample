package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring configure file 
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext
				("BeanLifeCycle-applicationContext.xml");
		
		//retrieve bean from the spring container 
		//call the main obj aka Coach theCoach 
		//myCoach is the name 
		Coach theCoach = context.getBean
				("myBaseballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		//close the context
		context.close();


	}

}
