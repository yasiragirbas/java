package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*if number is between 1-1o---> number is small
		 * if number is between 11-100--> number is medium
		 * if number is between 101-1000 --> number is large
		 */

		int num=15;
		if(num>1 && num<=10) {
			System.out.println("number is small");
		}else if(num>10 && num<=100) {
			System.out.println("number is medium");
		}else if(num>100 && num<=1000){
			System.out.println("number is larger");
		}else {
			System.out.println("number is not in our range");
		}
			}

}
