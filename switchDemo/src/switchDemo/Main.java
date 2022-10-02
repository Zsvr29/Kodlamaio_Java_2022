package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade='C';
		 switch(grade) {
		 
		 case 'A':
			 System.out.println(" Mükemmel Gecti");
			 break;
			 
		 case 'B':
			
		 case 'C':
			 System.out.println("Iyı geçtiniz");
			 break;
		 case 'D':
			 System.out.println("Fena degıl");
			 break;
			 
		 case 'F':
			 System.out.println("Kaldı");
			 break;
			 default:
				 System.out.println("Gecersiz not gırdınız");
				 
			 
		 }
	
	}
	

}
