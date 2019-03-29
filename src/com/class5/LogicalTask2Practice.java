package com.class5;

import java.util.Scanner;

public class LogicalTask2Practice {
	
	public static void main(String[]args) {
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz = scan1.nextInt();
		
		Scanner scan2=new Scanner(System.in);		
		System.out.println("Please enter your mid term score");		
		int midTerm=scan2.nextInt();
		
		Scanner scan3=new Scanner(System.in);
		System.out.println("Please enter your final score");
		int finalScore= scan3.nextInt();
		
		int avarage = (quiz+midTerm+finalScore)/3;
		System.out.println("Your avarage is "+avarage);
		
		if (avarage>=90) {
			System.out.println("Your grade is A");}
			else if(avarage>=70 && avarage<90) {
				System.out.println("Your grade is B");
			}else if(avarage>=50 && avarage<70) {
				System.out.println("Your grade is C");
			}else if(avarage<50) {
				System.out.println("Your grade is F");
			}else {
				System.out.println("Please enter a valid avarage");
			}
		}
			
		
		
		
		
	}


