package com.class7;

import java.util.Scanner;

public class ScannerAndLLop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Promt user to ask the name 3 times and print "you are doing great____"
		
		Scanner scan=new Scanner(System.in);
		int a=1;
		
		while(a<=3) {
			System.out.println("Please enter your name");
			String name=scan.nextLine();
			System.out.println("You are doing great "+name);
		}
		a++;
		
		
	}

}
