package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner;
		int num1, num2;
		int largest=0;
		myScanner=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
		
			System.out.println("Please enter first number");
			num1=myScanner.nextInt();
			
			System.out.println("Please enter second number");
			num2=myScanner.nextInt();
			
				if(num1>num2) {
					largest=num1;
				}else if(num2>num2) {
					
					largest=num2;
				}else {
					System.out.println("num1 is equal num2");
				}
			
	}

}
}