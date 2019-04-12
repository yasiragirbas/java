package com.class20;

public class Task2 {
	String X;
	String getScore(int score) {
		if(score>90) {
			X="A";
		}
		if(score>80 && score<90) {
			
			X="B";
		}
		if(score>70 && score<80) {
			
			X="C";
		}
		if(score>50 && score<70) {
			
			X="D";
		}if(score>0 && score<50) {
			X="F";
		}
		return X;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj=new Task2();
		System.out.println(obj.getScore(85));
		

		
	}
	
	

}
