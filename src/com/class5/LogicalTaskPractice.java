package com.class5;

import java.util.Scanner;

public class LogicalTaskPractice {
	
	public static void main(String[] args) {
		
		Scanner inc = new Scanner(System.in);
		
		System.out.println("Please enter your height");
		
		double height= inc.nextDouble();
		
		if(height<5) {
			System.out.println("short");
			
		}else if(height>=5 && height<=6) {
			System.out.println("medium");
		}else if(height>6) {
			System.out.println("tall");
		}else {System.out.println("Please enter valid value");
			
				
		}
		
		
	}
	

}
