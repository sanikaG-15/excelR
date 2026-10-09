





package day2;

import java.util.Scanner;

public class IfConditionDemo {

	public static void main(String[] args) {
		Scanner          sc      =new   Scanner(System.in); //how to make object in java 
		// classname objectnamec = new classname(); this is a syntax
		
		System.out.println("Enter your percentage");
		
		double percentage=sc.nextDouble(); //percentage=56.7
		
		
		if(percentage>=40.0)              //write if , variable name     is 56.7>=40.0   true  
			
		{                                 // read is , variable value 
		System.out.println("Pass");	      // display "pass"
		}
		
		else
		{
			System.out.println("Failed");   //display "failed"
			
		}
		System.out.println("Thank You");   //display "Thank You"
		
		
	}

}
