package com.class4;

import java.util.Scanner;

public class YearsAndSallary {
	public static void main(String[] args) {
		
		int years;
		int sallary;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is numbers of worked years");
		
		years=scan.nextInt();
		
		System.out.println("What is your annual salary");
		
		sallary=scan.nextInt();
		
		if(years>=5) {
			System.out.println("You are elegible for the bonus");
			if(sallary>500000) {System.out.println("Your bonus amount is $5000");}
			else {System.out.println("Your bonus amount is $3000");}
		}else {System.out.println("You are not elegible for the bonus");}
		
		
	}

}
