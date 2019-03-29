
public class Recup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//let's create an array of names that hold 5 elements and retrieve all values from it 
		
		String[] names=new String[7];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva";
		names[6]="Sandesh";
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
				
		//2. create an array usuing array literal
		
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Yasir", "Frank"};
				
		for(int i=0; i<studentNames.length; i++) {
			System.out.println(studentNames[i]);
			
		}
		//retrieve vluses using:advanced for loop, for each loo[, enhanced for loop
		
		for(String student : studentNames) {
			System.out.println(student);
		}

	}

}
