package model;

public class At extends Hayvan { // At sınıfı ile hayvan sınıfını miras alalım

	
	// Protected değişkenlere ve metotlara 
	// 1. Nesne türeterek , miras alan sınıftan
	// 2. Metot
	// 3.Constructor
	// 4. Instance intializer block ( örnek başlatıcı blok ) 
		
	public At() {
		System.out.println("Görüşürüz.");
	}

	@Override
	public void sesVer() {
		System.out.println("At kişniyor...");
	}
	// Artık bu class'dan bir nesne türetildiği zaman bu metodu içerecek
	
	
}
