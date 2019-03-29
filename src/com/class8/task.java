package com.class8;

import java.util.Scanner;

public class task {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the starting number");		
		int startnumber=scan.nextInt();
		
		
		System.out.println("Please enter ending number");		
		int endNumber=scan.nextInt();
		
		if(startnumber<endNumber) {
		for(int i=startnumber; i<=endNumber; i++) {
			
			System.out.println(i);
		}
		
	}else {
		System.out.println("I won't run your code");
	}
			
		
		
	}

}
