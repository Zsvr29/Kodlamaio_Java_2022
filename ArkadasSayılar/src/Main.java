
public class Main {

	public static void main(String[] args) {
		
		//220 ve 284 dur. Kendılerı harıc pozitif tam bolenlerı bırbırne toplamı bırbırıne esit olan sayılara denır.
		// 1 den baslayıp 220 ye kadar 220 yı bolen 220 dahıl dedgıl tum sayıların toplamı 284 ıken 1 den  baslayıp 284 u bolen 284 dahıl degıl tum sayıların toplamı 220 ye esit ise arkadas sayılardır.
		int sayi1=220;
		int sayi2=284;
		
		int toplam1=0;
		int toplam2=0;
		for (int i = 1; i <sayi1; i++) {
			if (sayi1%i==0) {
				toplam1=toplam1+i;	
			}
		
		}
		for (int i = 1; i <sayi2; i++) {
			if (sayi2%i==0) {
				toplam2=toplam2+i;
				
			}
			
		}
		if (sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu ıkı sayı arkadastır");
			
			}
		else {
			System.out.println("Arkadas degıldır.");
		}
		
	}

}
