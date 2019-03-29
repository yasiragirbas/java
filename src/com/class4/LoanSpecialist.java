package com.class4;

import java.util.Scanner;

public class LoanSpecialist {
	public static void main(String[] args) {
		
		long loan;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is te amount of needed loan");
		 
		loan=scan.nextInt();
		
		if(loan<=200000) {System.out.println("As a Yasir Bank we can lend the needed loan for you");}
		else {System.out.println("We are so sorry, we cant approve your application");}
	
		
		
		
		
	}

}
