package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
		
	//create a array of strings 
	private String[] data = {
		
		"Good fortune is coming for you",
		"my rising sun is with me",
		"scorpio is with the alignment with the sun"
			
			
	};
	//create a random number generator 
	private Random myRandomArray = new Random();

	
	@Override
	public String getFortune() {

		//pick a random array from the string 
		int index = myRandomArray.nextInt(data.length);
		
		String theFortune = data[index];
		
		
		
		return theFortune;
	}
	

}

/* 1. create a class called RandomFortuneService 
 * 2. add in the interface for the FortuneService
 * 3. create a private String[] array called data
 * 4. inside{} add in 3 "strings", "++"
 * 5. create/utilize the Random, name it myRandomArray 
 * 6. inside the getFortune() method generate a nextInt() 
 * 7. name it int index
 * 8. connect myRandomArry with nextInt()
 * 9. () inside the nextInt param connect
 * 10. (data.length)
 * 11. create a String theFortune to house in the data[index]  
 * 12. call theFortune
 * 
 * */






