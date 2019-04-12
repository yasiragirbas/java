package com.class20;

public class AccessModifiers {
	
	public String name="John";
	
	
	// Create a method that will take 1 parameter as a String and return reversed String. 
    // Method should be visibly only within same package.
	
	String x;
	protected String samePackage(int score) {
		if (score>1000) {
			x="yasir";
		}else if(score>800) {
		      x="nur";	
		}else {
			x="Jhon";
		}
return x;
		
		
	}
	//Create a method that will take a String and return whether String is palindrome or not. 
   // Method should available to all classes within your projects.
   
	public String palindrome(String word) {
		
		String reverse="";
		 
		for(int i=word.length()-1;i>=0;i--) {
		reverse=reverse+word.charAt(i);
		
		}
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("The word "+word+ " is palindrome");
		}else {
			System.out.println("Word is not palindrome");
		}
		return reverse;
	}
      //Create a method that will take a string and return array of words from that string. 
      //Method should be available only within same class.
	private String[] getWordsFromString(String str) {
        String[] words=str.split(" ");
        return words;
		
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		
		
		AccessModifiers obj=new AccessModifiers();
		String a=obj.samePackage(850);
		System.out.println(a);
		
		String b=obj.palindrome("moom");		
		
		 String[] array=obj.getWordsFromString("Have a good night students");
	     for (int i=0; i<array.length; i++) {
	         System.out.println(array[i]);
	        }
	        System.out.println("--------------------------");
	       for (String word:array) {
	        System.out.println(word);
	        }
	}

}
