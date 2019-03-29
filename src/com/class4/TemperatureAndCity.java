package com.class4;

import java.util.Scanner;

public class TemperatureAndCity {
	
	public static void main(String[] args) {
		//Ask user to enter city and temperature in Fahrenheit
		//Your program should convert F-->C
		//Your program shoul say "The temperature in the city --- is ---"
		
		String city;
		int tem;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your City");
		
		city=scan.nextLine();
		
		System.out.println("Please enter the temperature in Fahrenheit");
		
		tem=scan.nextInt();
		
		int convertedTemp=(tem-32)*5/9;
		
		System.out.println("The temperature in the city "+city+ " is " +convertedTemp);
		
		
		
		
	}

}
