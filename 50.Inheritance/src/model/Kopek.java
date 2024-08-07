package model;

public class Kopek extends Hayvan{ // alt class ( sub class ) / miras alan class
	
								    // Extends keyword ile miras alma işlemini yapıyorum ( miras al demek programlamada ) 
								   //  Extends ifadesinden sonra  class'ımın adını yazarak bu class'ın mirasını al demiş oluyorum.
	
					  // Kopek class'ı üzerinden hayvan class'ını miras alarak ,
					 // hayvan class'ı içerisindeki değişkenlere ve metotlara sahip olmuş oldum ( onları miras aldım )
	
	public Kopek() {
	System.out.println("Selam");
	}

	@Override // Bunun anlamı bu sınıftan bir nesne türettiğim zaman artık
			 // Kalıtım yoluyla Hayvan class'ından aldığın sesVer metodunu kullanma
			 // Ben bu metodu burada yeniden tanımlıyorum artık bunu kullan
	public void sesVer() {
		System.out.println("Köpek havlıyor...");
	}
	
	
	

	
}
