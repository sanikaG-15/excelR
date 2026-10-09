package day2;

import java.util.Scanner;

public class AdditionOfHeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);    //ctrl + shift + o (orange) no need to write the import function here we can use ctrl   shift  o for orange
		 System.out.println(" Please enter height of person 1");
		    double height1=sc.nextDouble();
		    System.out.println(" Please enter height of person 2");
			double height2=sc.nextDouble(); 
			
			double sumHeight=height1+height2;
			System.out.println("The sum of heights is  " +sumHeight);
			
			
			

	}

}
