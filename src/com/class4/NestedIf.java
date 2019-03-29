package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to check work eligibility
		//if user younger than 16 not allowed to work
		//otherwise allow the work, if user yonger than 64 go to work, otherwise  --> enjoy your life
		
		
		int age=65;
		
		int eligibleAge=16;
		int retirementage=65;
		
		if(age<eligibleAge) {System.out.println("You are too young, no work for you");
		
		}else {System.out.println("You are too young, no work for you"); 
		if(age<retirementage) {
			System.out.println("Go to work hard");}
		else {System.out.println("Please enjoy your life, You dont need to work");}
		}
		}
		
		
	}


