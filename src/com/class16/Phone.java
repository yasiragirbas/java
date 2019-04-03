package com.class16;

public class Phone {


		// TODO Auto-generated method stub
		
		// Create a class phone create 3 objects of it: Iphone,Android, Nokia with specific atributes and behaviours
		
		String color,os;
		boolean touchScreen;
		int memory;
		
		public static void main(String[] args) {
		
		Phone iphone=new Phone();
		iphone.os="IOS";
		iphone.color="white";
		iphone.touchScreen=true;
		iphone.memory=64;
		
		//behaviours
		iphone.playGame();
		iphone.playMusic();
		iphone.Apps();
		
		Phone Android= new Phone();
		Android.os="Android";
		Android.color="black";
		Android.touchScreen=true;
		Android.memory=128;
		//behaviours
		
		Android.playGame();
		Android.playMusic();
		Android.Apps();
		
		Phone nokia=new Phone();
		nokia.os="google";
		nokia.color="blue";
		nokia.touchScreen=false;
		nokia.memory=16;
		//behaviours
		
		nokia.playGame();
		nokia.playMusic();
		nokia.Apps();
		
		}
		
		void playGame() {
			System.out.println("We can play game on "+os);
			
		}
		void playMusic() {
			System.out.println("We can play music on "+os);
		}
		
		void Apps() {
			System.out.println("We can open apllications on "+os);
		}
		
		
	

}
