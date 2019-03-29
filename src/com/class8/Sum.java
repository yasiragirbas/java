package com.class8;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1; i<=5; i++) {
			
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		//find sum of all even numbers from 1 to 100
		
		int suma=0;
		
		for(int a=0; a<=100; a+=2) {
			suma=suma+a;
			
		}
		System.out.println(suma);
	}
	
	

}
