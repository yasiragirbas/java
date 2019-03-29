
public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of cars:american, german, korean,italian. Then retrieve all values from that array
		
		String[][] cars= {
				{"chev","ford","crysler"},
				{"Walkswogen", "Audi","Mercedes","BMW"},
				{"kia","hyundai"},
				{"ferrari","Bugatti"}
		};
		
		for(int i=0; i<cars.length;i++) {
			for(int y=0;y<cars[i].length;y++) {
				System.out.print(cars[i][y]+" ");
			}
			System.out.println();
		}

	}

}
