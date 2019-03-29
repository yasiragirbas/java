package com.class8;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Ask user to pay for soda keep asking user to pay for soda until entered price is not equal to 1.99 after user got  right amount	*/	
	//print "enjoy your soda"
		
		Scanner scan;
	double price;
	
	scan=new Scanner(System.in);
	
	do {
		System.out.println("Please pay for soda");
		price=scan.nextDouble();
		
	}while(price!=1.99);
	
	System.out.println("Please enjoy your soda");	
	}

}
