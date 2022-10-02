
public class Main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean sayıvarmı=false;
		
		for (int sayi:sayilar) {
			if (sayi==aranacak) {
				sayıvarmı=true;
				break;
			}
		}
		if (sayıvarmı) {
			System.out.println("Sayı mevcut");
		}
		else {
			System.out.println("Sayı mevcut degıl.");
		}
	}
}
