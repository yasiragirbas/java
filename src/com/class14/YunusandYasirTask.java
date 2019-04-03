package com.class14;

public class YunusandYasirTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 

		2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

				
		 */
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		int minumum=arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		
		/*Second way
		 *   int min = arr[0];//0
        int secondLargest = 0;//0
        int largest = 0;//0
        
        for(int a: arr) {
            if(a>largest) {
                largest =a;
            }
            if(a < min) {
                min = a;
            }
        }
        for(int a : arr) {
            
            if(a> secondLargest && a <largest) {
                
                secondLargest = a;
            }
        }
        System.out.println(“min = ” + min);
        System.out.println(“Second Largest = ” + secondLargest);

        System.out.println(“Largest = ” + largest);
		 * 
		 */
		
		for (int i = 0; i < arr.length; i++) {
			 
			if (arr[i] > largest) {
				
				largest = arr[i];
 
			} 
		}
 System.out.println(largest);
 
 for (int i = 0; i < arr.length; i++) {
	 
		if (arr[i] < minumum) {
			
			minumum = arr[i];

		} 
	}
  
 System.out.println(minumum);
 
 //3. Find out how many alpha characters present in a string?

 String str="yunus yasir where are%%2^ you going123214";
 
 String str2=str.replaceAll("[^A-Z a-z]", "");
 
System.out.println(str2);

System.out.println(str2.length());



//4.How to find out the part of the string from a string? What is substring? Find number of words in string?
 
 
 String str3 ="How to find out the part of the string from a string? What is substring? Find number of words in string?";
 
 String[] array= str3.split(" ");
 
 for(String a:array) {
 
 System.out.println(a);
 
 
	}
 System.out.println(array.length);
 
 //5. Write a java program to reverse String? Reverse a string word by word?
 
 
 String str4 ="How to find out the part of the string from a string? What is substring? Find number of words in string?";
 
 String reverse= "";
 
 for(int i=str4.length()-1; i>=0; i--) {
	 
	 reverse=reverse+str4.charAt(i);
 }
 System.out.println(reverse);
 
 String[] words=str4.split(" ");
 
 for (int i=words.length-1; i>=0; i--) {
	 System.out.print(words[i]+" ");
 }
 
  
	}
}


