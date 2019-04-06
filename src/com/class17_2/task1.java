package com.class17_2;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumEven=0;
		int sumOdd=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first integer");
		int first= scan.nextInt();
		System.out.println("Please enter end integer");
		int end= scan.nextInt();
		
		if(first<end) {
			
			for(int a=first; a<=end; a++) {
				if(a%2==0) {
					sumEven+=a;
				}else {
					sumOdd+=a;
				}
				
			}
System.out.println("The sum of the even numbers is "+sumEven);
System.out.println("The sum of the odd numbers is "+sumOdd);
		}
		
		
		
 
	 
	 
	 
 }
	}


