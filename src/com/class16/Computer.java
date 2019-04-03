package com.class16;

public class Computer {
	
	String os, brand;
	boolean mouse, keyboard;
	int screen, ram;
	
public static void main(String[] args) {
	Computer comp1=new Computer();
	
	comp1.os="Windows";
	comp1.mouse=true;
	comp1.keyboard=false;	
	comp1.screen=2;
	comp1.ram=8;
	comp1.brand="HP";
	
	//beaviour
	comp1.watchMovie();
	comp1.doJavacoding();
	comp1.playMusic();
	
	
	Computer comp2=new Computer();
	
	comp2.os="Mac";
	comp2.mouse=true;
	comp2.keyboard=false;	
	comp2.screen=2;
	comp2.ram=8;
	comp2.brand="Apple";
	
	//beaviour
	comp2.watchMovie();
	comp2.doJavacoding();
	comp2.playMusic();
	
	
}
	
	
	
	void watchMovie() {
		System.out.println("We can watch movie in our computer "+brand);
	}
	
	void doJavacoding() {
		System.out.println("We can do Jva coding on our computer");
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer");
	}

}
