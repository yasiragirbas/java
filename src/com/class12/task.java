package com.class12;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your user name");
		String name=scan.nextLine();
		System.out.println("Please create a pasword");
		String password=scan.nextLine();
		System.out.println("Please confirm the password");
		String confirm=scan.nextLine();
		
		Boolean a=name.isEmpty();
		if(a==true) {
			System.out.println("User name con nut be empty");
		}
		
		
		int b=password.length();
		if(b<8) {System.out.println("Passwort is too short, it has to be 8 charcacter");
			
		}else {
			
		}
		
		Boolean c=password.contains(name);
		
		if(c==true) {
			System.out.println("Password can not contain username");
			
		}else {
			
		}
		
		Boolean d=confirm.equals(password);
		if(d==false) {
			System.out.println("Password do not match");
		}

		System.out.println("Your username and password has created");
	}

}
