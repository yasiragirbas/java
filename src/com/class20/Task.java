package com.class20;

import java.util.Scanner;

public class Task {
	String name, lastName, email;
	
	String createEmail() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("Please enter your lastname");
		lastName=scan.nextLine();
		System.out.println("Please enter your email");
		email=scan.nextLine();
		System.out.println(email);
	
		return email;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a method createEmail()
		 * Based on provided user name, lastName and email type,
		 * your method should return complete email adress
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com
		 */
		
		Task obj1=new Task();
		obj1.createEmail();

		
		
	}

}
