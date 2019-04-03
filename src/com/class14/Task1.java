package com.class14;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		String str="Hello guys, this is our class";
		
		String replaced=str.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced);
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str2="selam %^& genclik 123";
		
		String replaced2=str2.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced2);
		str2=replaced2;
		
		char[] array= str2.toCharArray();
		System.out.println(array.length);
		
		//You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String a= "Is it saturday! Is it raining! Do we have a Java Class today?";
		
		String[] words = a.split("[!]");
		System.out.println(words.length);
		
		
		
		
		
	}

}
