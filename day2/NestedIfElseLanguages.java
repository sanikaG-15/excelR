package day2;

import java.util.Scanner;

public class NestedIfElseLanguages {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("1. English");
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter choice");
		
		
		 int choice = sc.nextInt();
		 
		// =assignment
		// a = 10; assisgning value 10 to variable a
		
		if(choice==1)            // == comarison 
			
		{                                 
		System.out.println("Call routed to London");	      
		}
		
		else if(choice==2)               
		{
			System.out.println("Call routed to Delhi");
		} 
		else if(choice==3)
			
		{
			System.out.println("Call routed to Mumbai");
			
		}
		
		else 
		{
			System.out.println("Invalid Input");
		}
		
		
		
		
		
		System.out.println("Have a Nice Day Ahead");   //display "Thank You"
		
		





	}

}
