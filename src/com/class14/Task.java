package com.class14;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		/*
		 * write a program that reads two peoples first names
		 * and if they expecting boy or girl?
		 * Based on the input suggetts a name for bay
		 */

		
		Scanner scan;
		String motherName, fatherName, gender;
		String babyName=null;
		
		scan =new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2+motherName.length()/2);
			
		}else if(gender.equalsIgnoreCase("girl")) {
			babyName=motherName.substring(0,motherName.length()/2+fatherName.length()/2);
		}else {
			System.out.println("Unknown");
		}
		
		System.out.println(babyName.toUpperCase());
		
		
		
	}

}
