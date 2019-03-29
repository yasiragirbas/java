package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Ask user to enter the item they want to buy and  the price for the item. 
		 * Then ask user to pay for it. Every time user enters money accumulate the amount 
		 * and tell user how much is left to pay off the amount. Whenever user done with payments 
		 * tell them "Thank you for shopping!"
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the item number");
		String item=scan.nextLine();
		System.out.println("Please enter the price for the item");
		double price=scan.nextDouble();
		double balance=0;
		double totalPayment=0;
		do {
			System.out.println("Please enter your payment amount");
			                  double payment=scan.nextDouble();
			                  
			      totalPayment=payment+totalPayment;
			      balance=price-totalPayment;
			      
			      System.out.println("Please enter "+balance+"$ more");
			
		}while(totalPayment!=price);
		System.out.println("Thanks for shoping");
			
		
			
		
			
		}
				
		
	}


