package com.class21;

public class Dog {
	
	static String breed="Husky";
	static int paws=4;
	String name;
	int weight;
	int heigth;
;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		//1st dog
		dog1.name="Mardy";
		dog1.weight=60;
		dog1.heigth=40;
		dog1.getDogProperties();
		//2nd dog
		breed="pug";
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.heigth=90;
		dog2.getDogProperties();
		//3rd dog
		
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.heigth=30;
		dog3.getDogProperties();
		
		// 3 ways to access to static variable breed
		
		System.out.println(breed);
		System.out.println(Dog.breed);
		System.out.println(dog3.breed);
		

	}
	public void getDogProperties() {
		System.out.println(name+" is breed of "+breed+ " and weight is "+weight+ " and height "+heigth);
	}

}
