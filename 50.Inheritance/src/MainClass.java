import model.At;
import model.Kopek;

public class MainClass {
			public static void main(String[] args) {
				
		// INHERİTANCE ( KALITIM )
				
		// Kalıtımın en güzel avantajı üst sınıflarda tanımlanan metot ve değişkenleri 
		// tekrar tekrar yazmaktan kurtarmasıdır.
				
		
		// 1. Bir class'ı yüzlerce class miras alabilir fakat bir class tek bir class'ı miras alabilir.
		// ( Bir class'ın tek bir üst class'ı olur yani).  
	
				
		Kopek dog1 = new Kopek();
		dog1.id=123123L; // Kopek sınıfı ile hayvan sınıfının mirasını aldığım için 
						 // hayvan sınıfındaki id değişkenine artık sahibim ve kopek sınıfından ürettiğim nesne ile değişkene değer atadım.
		
		
		// Protected erişim belirleyicisinin anlamı :
		// Hem bulunduğu class içerisinden erişilebilen hem de o class'ı miras alan alt (sub) classlar tarafından erişilebilen demek.
		
		
		// Protected erişim belirleyicisi alanlara ( değişkenler , metotlar )  erişmek için ya bir metot , ya bir constructor 
		//  ya bir nesne ,  yada bir instance intializer block içerisinden erişim sağlayabilirim.
			
		// Yapıcı metodlar ve miras alma ;
		// A ve B class'ı olsun. A class'ı B'yi miras alıyor olsun. 
		// Ben A class'ından nesne türetirken A class'ının yapıcı metodundan önce , A class'ının (miras aldığı)  
		// B class'ının yapıcı metodu çalışır ilk olarak.Ondan sonra A class'ının yapıcı metodu çalışır.
		// Miras alınandan miras alana doğru yapıcı metotların çalışma mantığı
			
		At horse1 = new At();
		horse1.id=1231241L;
		
		// this , super , super()--->(çağırırken constructor overloading) kelimelerinin kullanımı
		
		// this : bulunduğum class'ın içi demek
		// super : miras aldığım class'ın içi demek
		// super() miras aldığım class'ın constructor'ına git demek.
		
	
		// Nesne türeterek metod içinde super anahtar kelimesi kullanımı 
		A nesne1 = new A();
		
		nesne1.isimYazdir(); 
		
		B object = new B(1,2);
		
		System.out.println((object.cdegisken1) +" "+(object.cdegisken2));
		
		//  B class'ının içinde super metodu ile C super class'ını çağırdım ve yapıcı metodunun parametrelerine 
		// B class'ının yapıcı metoduna girdiğim parametreleri atadım.
		
		
		// Override ile ilk önce geçersiz kıldığım ,
		//sonrada kopek class'ında yeniden tanımladığım sesVer metodu
		
		dog1.sesVer();
		
		horse1.sesVer();
		
		
		
			}


}

