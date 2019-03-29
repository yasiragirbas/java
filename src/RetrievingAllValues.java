
public class RetrievingAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] num= {
		{11,12,13,14},
		{21,22,23},
		{31,32,33,34}
};

for(int row=0; row<num.length; row++) {
	for(int col=0; col<num[row].length; col++) {
		System.out.print(num[row][col]+ " ");
	}
	System.out.println();
}

String [][] food= {
		{"kebab", "Sarma", "Pilav", "Manti"},
		{"kofte", "corba"},
		{"Fasulye", "Nohut","Bamya","sdkjfkjksdh"}};
		
		for(int i=0;i<food.length;i++) {
		   for(int y=0; y<food[i].length;y++) {
			   
			   System.out.print(food[i][y]+" ");
			   
		   }
		   System.out.println();
		}
		
		

	}

}
