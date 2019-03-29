

package com.class13;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        
        // 2. task
        String str2="hello everybody";
        System.out.println();
        
        if(!str2.isEmpty()) {
        	if(str2.length()%2==1 && str2.length()>=3) {
        		System.out.println(str2.charAt(str2.length()/2));
        	}
        }
        
        
        
    }
}
		
	


