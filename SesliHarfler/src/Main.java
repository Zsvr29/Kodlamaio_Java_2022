
public class Main {

	public static void main(String[] args) {
		
		char harf='A';
		switch (harf) {
		case 'A':
		case 'I':	
		case 'O':
		case 'U':
			System.out.println("Kalın seslı harfler");
			break;
		
		default:
			System.out.println("İnce harflı sesler");
			break;
		}

	}

}
