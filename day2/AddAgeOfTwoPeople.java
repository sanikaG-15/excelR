package day2;

import java.util.Scanner;

public class AddAgeOfTwoPeople {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);    //ctrl + shift + o (orange) no need to write the import function here we can use ctrl   shift  o for orange
		 System.out.println(" Please enter age of person 1");
		    int age1=sc.nextInt();
		    System.out.println(" Please enter age of person 2");
			int age2=sc.nextInt(); 
			
			int sum=age1+age2;
			System.out.println("The sum of ages is " +sum);
			
			

	}

}
