
public class Main {

	public static void main(String[] args) {
		
		// bolenlerının sayısı toplamı kendısıne esıt olan sayıya denır
		// 6 mukemmel bır sayıdır.bolenlerı 1-2-3 
		//28 1-2-4-7-14
		int number=28;
		int total=0;
		
		for (int i = 1; i <number; i++) {
			if (number%i==0) {
				total=total+i;
				
			} 
		}
		if (total==number) {
			System.out.println("Mukemmel sayıdır");
			
		}
		else {
			System.out.println("Mukemmel sayı degıldır.");
		}
		
		

	}

}
