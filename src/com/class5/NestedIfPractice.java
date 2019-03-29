package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if user has a credit card
		//check what is the balance id balance is more than 100---> pay off
		//else you are good
		
		boolean creditCard=true;
		
		int balance=1000;
		
		if(creditCard) {
			System.out.println("Let's check the balance");
			
				if(balance>=1000) {
					System.out.println("pay off now");
				}else if(balance==0){
					System.out.println("please use yout card");
				}
				else {
					System.out.println("you are safe");
				}
		}else {
			System.out.println("Do you want a credit card");
		}

	}

}
