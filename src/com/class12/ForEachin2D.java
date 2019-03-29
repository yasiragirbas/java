package com.class12;

public class ForEachin2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a grocery list:fruits, veggies, dairy
		 * Retrieve all values using 2 different loops
		 */

		String[][] grocery= {
				
				{"apple","banana","orange","kiwi"},
				{"carrot","tomado","cucumber", "Pepper"},
				{"milk","yogurt","Cheese"}
		};
		
		for(int i=0; i<grocery.length; i++) {
			for(int j=0; j<grocery[i].length;j++) {
				System.out.print(grocery[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("For each loop----------------------");
		for(String[] products:grocery) {
			for(String all:products) {
				
				System.out.print(all+" ");
			}
			System.out.println();
			
		}
	}

}
