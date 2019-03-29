
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an array of integers and find largest number
		
		int[] numbers= {39,6,19,34};
		
		int largest=numbers[1];//assuming
		
	 for(int i=0; i<numbers.length; i++) {
		 if(numbers[i]>largest) {
			 largest=numbers[i];
		 }
		 
		 
		 
	 }
System.out.println("The largest number is "+largest);
	}

}
