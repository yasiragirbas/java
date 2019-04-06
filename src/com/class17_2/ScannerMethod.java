package com.class17_2;

import java.util.Scanner;

class ScannerMethod {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		ScannerMethod obj=new ScannerMethod();
		System.out.println("Enter first nuber");
		int a=scan.nextInt();
		System.out.println("Please enter second number");
		int b=scan.nextInt();
		
		System.out.println(obj.sum(a, b));
		obj.sub(a, b);
		
		
				
	}
	 public int sum(int x, int y) {
		//System.out.println(x+y);
		return x+y;
	}
	public void sub(int x, int y) {
		System.out.println(x-y);
	}

}
