package com.class17;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj=new Task2();
        obj.num( 15);
		
		
		
	}
	
	void num(int number) {
		if(number%2==0) {
			System.out.println("The number "+number+" is even");
			
		}else {
			System.out.println("The number "+number+" is Odd");
		}
	}

}
