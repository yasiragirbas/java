package com.class15;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Write a java program to check whether a given number is prime or not?
		//Prime number should meet 2 conditions:divisible by 1 and by itself only
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime");
		number = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {

			}else {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}

}
