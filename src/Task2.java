
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String[] countries = {"Turkey", "Usa", "Afganistan", "France", "Holanda"};
	
		for(int i=0; i<countries.length; i++) {
			
			if(countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if (countries[i].equals("Usa")) {
				System.out.println("Washington");
				
			}*/
			// Second way
			
			String[] name= {"USA", "Canada", "Mexico", "Venezuela"};
			
			for (String country:name) {
				
				switch(country) {
				case"USA":
				System.out.println("Washington");
				break;
				case "Canada":
				System.out.println("Ottova");
				break;
				case "Mexico":
					System.out.println("Mexico City");
				break;
				case "Venezuela":
					System.out.println("Caracas");
					break;
				}
				
			}
		}
	}
	


