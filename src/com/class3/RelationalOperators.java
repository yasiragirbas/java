package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=19;
		int b=50;
		
		boolean result=a>b;
		boolean result1= a==b;
		System.out.println(result);
		System.out.println(result1);
		
		if(a<b) {
			System.out.println("a is smaller than b");
					
		}else { System.out.println("b is smaller than a");
			
		}
		
		if (a==b) {
			System.out.println("Hello");
		}else {System.out.println("Bye");
		}
		
		//declare price and if price is higher than expected -->I wil not buy
		
		double shoesPrice=29.99;
		double allowedPrice=31.99;
		
		if(shoesPrice<=allowedPrice) {System.out.println("I am buying the shoes");
		
		}else {System.out.println("I am not buying the shoes");}
		
		System.out.println("I am continues code");
		
	}

}
