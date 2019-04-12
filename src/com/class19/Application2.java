package com.class19;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal dog=new Animal();
    
    System.out.println(dog.breed);
    System.out.println(dog.weight);
    System.out.println(dog.age);
    System.out.println(dog.name);
    
    dog.name="karabas";
    
    Animal dog2=new Animal();    
    System.out.println(dog2.breed);
    System.out.println(dog2.weight);
    System.out.println(dog2.age);
    System.out.println(dog2.name);
    
    int my_array[]= {1,2,3,4,5,6,7,8,9,10};
    int[] array= {25,45,6,5,34,22,45,67,98};
    System.out.println("Printing the minimum value");
    
    System.out.println(Minimum.minOfValues(my_array));
    System.out.println(Minimum.maxOfValues(array));
    
    
	}

}
