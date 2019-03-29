package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*I want to print pattern
		 * *
		 * **
		 * ***
		 * ****
		 */
for(int i=1; i<5; i++) {
	for(int y=1; y<=i; y++) {
		System.out.print("*");
	}
	System.out.println();}
	
	for(int i=1; i<5; i++) {
		for(int y=1; y<=6; y++) {
			if(i==1 || i==4 || y==1 || y==6) {
				System.out.print("*");
			}else {
				System.out.print(" ");
				
			}
			
		}
		
		System.out.println();
}


	}
	}



