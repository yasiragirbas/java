package com.class15;

public class quiz {

	  public static void main(String[] args) {
		  
		//2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		  
		  int[] arr= { 12,311,334,546,-654,4};
		  int max=arr[0];
		  int secondMax=arr[0];
		  int min=arr[0];
		  
		  
		  for(int i=0; i<arr.length-1;i++) {
			  
			  if(arr[i]>max) {
				  max=arr[i];
			  }if(arr[i]<min) {
				  min=arr[i];
			  }
		  }
			  for(int a:arr) {
			  if(a>secondMax && a<max){
				  secondMax=a;
			  }
			  }
			  
		  
		  
	System.out.println(max);
	System.out.println(min);
	System.out.println(secondMax);
	    
		  
		  
		  	    }
		
	}


