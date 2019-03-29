package com.class4;

import java.util.Scanner;

public class DmvRepresentative {
	
	public static void main(String[] args) {
		
		int age;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How old are you");
		
		age=scan.nextInt();
		
		if(age>=18) {System.out.println("You can apply for a driver liccense");}
		else{System.out.println("We can offer you to aply for a learners permit");}
			
		
		
	}

}
