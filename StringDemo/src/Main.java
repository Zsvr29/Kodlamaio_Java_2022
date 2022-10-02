
public class Main {

	public static void main(String[] args) {
		
		String mesaj="   Bugun hava cok guzel.";
		System.out.println(mesaj);
		
    /* System.out.println("Eleman sayısı:"+mesaj.length());
     System.out.println("5. eleman:"+mesaj.charAt(4));  // indeks sayısını verır.
     //iki metni birlestırmek.
     System.out.println(mesaj.concat("Yaşasın!"));
     // B ile baslarsa true dondurur B ile baslamassa false dondurur.
     System.out.println(mesaj.startsWith("B"));
     System.out.println(mesaj.endsWith("."));
     // Karakterleri al.Bugun kelımesının  5 karakyterını almak ıstıyorum.
     char[] karakterler= new char[5];
     mesaj.getChars(0, 5, karakterler,0);
     System.out.println(karakterler);
     // belirttıgım karakterın mesajın ıcınde kacıncı eleman oldugunu bulmaya yarar.
    System.out.println(mesaj.indexOf('a'));
    System.out.println(mesaj.lastIndexOf('e'));
    */
		// degıstırm anlamına gelır ılgılı metındekı değerler değişir.
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(mesaj);// eskı deger,yenı deger,
		
		// bir metnın ıcerısınden parca almaktır.
		System.out.println(mesaj.substring(2));// 2. indeksden ıtıbaren.
		System.out.println(mesaj.substring(2,4));// 2 den basla 4 e kadar.
		
		for (String kelime: mesaj.split(" ")) {
			
			System.out.println(kelime);  // butun kelımerı alt alta yazdı.
		}
		
		System.out.println(mesaj.toLowerCase()); // mesajı kucuk harfe cevırır.
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // boslukları sıler.
   
     
	}

}
