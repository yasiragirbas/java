package com.class9;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct loap year.
		 * As soon as the user enters the correct loap year exit the loop
		 */
Scanner scan;
int leapYear;
int chance;
int insertYear;

scan=new Scanner(System.in);
for(int a=10; a>=1;a--) {
System.out.println("Please enter a leap year");
insertYear=scan.nextInt();

	
if(insertYear%4==0) {
	System.out.println("The year is leap year");
	break;
}else {
	System.out.println("The year is not a leap year");
}
	
}
	


		
	}

}
