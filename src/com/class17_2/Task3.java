package com.class17_2;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
for(int i=1;i<=5;i++) {
	for(int y=1; y<=i; y++) {
	System.out.print(y);
	
	}
	
	System.out.println();
	}
   
for(int i=1; i<=5; i++) {
	for(int y=1; y<=i; y++) {
		System.out.print("*");
			}
	System.out.println();
}
for(int i=1; i<=4; i++) {
	for(int y=4; y>=i; y--) {
		System.out.print("*");
			}
	System.out.println();

	}
}
}
