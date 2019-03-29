package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=6; i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
			
			
		}
		
for(int i=0;i<=10; i++) {
			
			if(i==2 ||i==3) {
				continue;
			}
			System.out.println(i);

	}

//i want to print number 1 to 20 but skip those that divisible by 3

for(int i=0;i<=20; i++) {
	
	if(i%3==0) {
		continue;
	}
	System.out.println(i);
}
}
}