package day2;

import java.util.Scanner;

public class CharInputUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);    //ctrl + shift + o (orange) no need to write the import function here we can use ctrl   shift  o for orange
		
		 
		  System.out.println(" Please enter your name");
		    char ch=sc.next().charAt (0);
		    

		    System.out.println(ch); // here we used char because we only want one character in our output 
		    
		


	}
	

}
