package com.class17_2;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a guessing program game where the user has to guess a secret number between 1 and 20.
		 * After every guessing input, the program tells the user whether their number was too large or too small
		 * . The program will keep asking the user to enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!.. You got it!"
		 */
		
		int winNumber =5;
		int luckyNumber;
		do{ Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your lucky number");
		 luckyNumber=scan.nextInt();
		
		 if(luckyNumber<winNumber) {
			 System.out.println("The number is to small, try again");
		 }else if (luckyNumber>winNumber){
			 System.out.println("The number is to large, try again");
		 }else {
			 System.out.println("Congratulations!!.. You got it!");
		 }
						
		}while(luckyNumber!=winNumber);
		

	}

}
