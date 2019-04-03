package com.class14;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am good tester!";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "Great");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester", "programmer");
		System.out.println(newStr2);
		
		str=str.replace("!", "?");
		System.out.println(str);
		
		//2
		String str1="12Hello 2334 World 465%-%";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		//Replace all characters "^" means olmayan
         
		String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(newString);
		
		
		String str2="1Hello123";
		
		
		System.out.println(str2.replaceAll("[^0-9]", ""));
		

	}

}
