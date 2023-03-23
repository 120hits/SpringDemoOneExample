package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		
		//load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve obj bean from spring container 
		Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
		
		//call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
			
		//call our new method fortune service 
		System.out.println(theCoach.getDailyFortune());
		
		//close the context 
		context.close();
	

}
	
}


/*	1. //self notes - looks like this is another main method like myapp
 * 
 * 	2. making a spring configure by first loading the file using 
 * 		- Creating Class-Path-Xml-Application-Context
 * 		- then naming it context 
 * 
 * 	3. Next we input the obj+context+getBean"id" + obj.class
 * 
 * 	4. call the method using sysout with the obj name.method (1st main method inside myapp)
 * 
 *  5. finally closing the context.close();
 * 		- 
 * 	7.-BBC) // call our new method fortune service 
 * 		- sysout by calling the main obj 
 * 		- followed by the .getDailyFortune()
 * 
 * 
 * 
 * */
 