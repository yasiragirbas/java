package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 using toCharArray
		
		String original="Today is Java Class";
		
		String reverse="";
		
		char[] array=original.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
			
		}
		System.out.println("Reversed String is: "+reverse);
		
		// 2 using  charAt()
		
		String reverse1="";
		for(int i=original.length()-1; i>=0; i--) {
			reverse1=reverse1+original.charAt(i);
			
		}
		System.out.println("Reversed String is: "+reverse1);
		
		// 3 using substring
		
		 String reverse2 = "";
	       for (int i=original.length(); i>0; i--) {
	         reverse2= reverse+original.substring(i-1, i);
	       }
	       System.out.println(reverse2);
		
		

	}

}
