package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//2.define a private field for the dependency 
	private FortuneService fortuneService;
	
	//3. define a constructor for dependency injection  
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	};
	
	@Override
	public String getDailyWorkout() {
		return "spend 30min batting";
	}

	@Override
	public String getDailyFortune() {
		
		//4. use my fortuneService to get a fortune for the return 
		
		return "Lets go " + fortuneService.getFortune();
	}
	
	// add in-it method 
	public void doMyStartupStuff() {
		System.out.println("baseBallCoach: inside method doMyStartupStuff");
	}
	
	//add in destroy method
	public void doMyCleanupStuff() {
		System.out.println("baseBallCoach: inside method doMyCleanupStuff");
	}
	

}


/* 1. inside this BaseballCoach class we have a method with the message of 
 * 		- "spend 30mins batting 
 * 
 * 2. Next we are gonna add some dependency private field 
 *  		//the capital F in for the interface 
 *  		//the lower f is for the vars names 
 * 
 * 3.Followed by 
 * 		//the constructor  starts with the same name as the baseballCoach class 
 * 		//for the argument you setup the actual interface name here ()
 * 		//make an assignment inside the constructor 
 * 		//the private field variable will merge with the parameter  of the constructor 
 * 		//spring will construct our obj and they will pass in the dependency 
 * 			//then we accept it and we assign it and
 * 		// So thats basically what is dependency injection 
 * 
 *   
 *   //Now our class is ready for dependency injection from the spring framework 
 * 
 * 
 * 
 * 4. To get the dailyFortunes he needs a helper class
 * 		- we are going to use that dependency that we passed in fortuneService
 * 		- then we get the dot(.)getFortune() method
 * 
 * 
 * 5.Configure the dependency injection 	in spring config file 
 * 		//dependency = helper 
 * 	5.1) go to your applicatonContext.xml file 
 * 		- give the id as myFortune 
 * 		- Copy the class name HappFortuneService 
 * 			with the qualified name TRICK		
 * 			- right click with the copied name 
 * 				"copy qualified name"
 * 		- Paste it inside the bean class = paste it here 
 * 
 * 6. Setup the constructor injection - XML file 
 * 		- use the constructor arg with the single bracket 
 * 		- use reference = "bean id name"
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 