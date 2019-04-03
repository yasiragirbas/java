package com.class14;

public class StriingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome Syntax Students Batch 4";
		String[] array=str.split("S");
		
		System.out.println(array.length);
		
		for(String substring : array) {
			System.out.println(substring);
		}
		
		System.out.println("----------------");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
				
		
		
	}

}
