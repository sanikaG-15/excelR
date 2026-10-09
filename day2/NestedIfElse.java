/*
 * monthlySalary >= 75,000  Excellent 
 * monthlySalary >= 60,000  V good    
 * monthlySalary >= 50,000  Good    
 * monthlySalary >= 25,000  OK    
 * monthlySalary < 25,000  Not ok    
 *    
 */
package day2;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your salary");
		 
		double salary=sc.nextDouble(); 
		
		
		if(salary>=75000)                 
			
		{                                 
		System.out.println("Excellent");	      
		}
		
		else if(salary>=60000)               
		{
			System.out.println("V Good");
		} 
		else if(salary>=50000)
			
		{
			System.out.println("Good");
			
		}
		else if(salary>=25000)
			
		{
			System.out.println("OK");
		}
		else 
		{
			System.out.println("Not Ok");
		}
		
		
		
		
		
		System.out.println("Thank You");   //display "Thank You"
		
		
	}

} 



