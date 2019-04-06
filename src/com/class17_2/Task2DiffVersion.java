package com.class17_2;

import java.util.Scanner;

public class Task2DiffVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*		 
		 * 2. Ask user to enter the item they want to buy and  the price for the item. 
		 * Then ask user to pay for it. Every time user enters money accumulate the amount 
		 * and tell user how much is left to pay off the amount. Whenever user done with payments 
		 * tell them "Thank you for shopping!"
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your Item");
		String item=scan.nextLine();
		System.out.println("Please enter the price for the item");
		double price=scan.nextDouble();
		double payment;
		double balance;
		double totalpayment=0;
		double change;
		
		
		do { System.out.println("Please enter your payment amount");
		     payment=scan.nextDouble();
		     totalpayment=payment+totalpayment;
		     
		     if(totalpayment>price) {
		    	 change=totalpayment-price;
		    	 System.out.println("Please take your money "+change);
		     break;}
		     else if(totalpayment<price) {
		    	 balance=price-totalpayment;
		    	 System.out.println("Please enter more $"+balance);
		    	 
		     }
					
		}while(totalpayment!=price);
		
		System.out.println("Thank you for your shoping");
	}

}
