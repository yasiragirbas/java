package com.class12;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {
				{1,2,3},
				{10,20,30},
				{100, 200, 300}
				
				
		};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
			
			System.out.print(arr[i][j]+ " ");
		}
System.out.println();
	}
		System.out.println("------For each Loop------");
		//loop through each element inside 2D array --->each element =array
		for(int[] singleArray:arr) {
			for(int numbers:singleArray) {
				System.out.print(numbers+" ");
			}
			System.out.println();
		}

}
}