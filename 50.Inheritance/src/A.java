
public class A extends B { // A sınıfı , B yi miras alıyor
	
	public String name = "Osman";
	public int degisken1;
	public int degisken2;
	
	public void  A1() {
		
		System.out.println("A class'ı yapıcı metodu");	
	}

	public A(int degisken1, int degisken2) {
		super();// super class'ın yapıcı metodu çağırıldı
		this.degisken1 = degisken1; // this ile bu sınıfın içindeki degisken1 , değişkenine gelen parametreyi ata dedim.
		this.degisken2 = degisken2;
	}
	 
	public void asinifiMetodu() {
		System.out.println("A class'ı metodu çalıştı.");
		super.bsinifiMetodu();// Super ne demekti üst class ( mirası alınan class)
         // Super keyword'unu kullanarak git super class'ın metodunu çağır dedim bu metot içerisinde
	}
	// Ben eğer super class'ın ( üst sınıfın ) metotlarına ve fieldslarına ulaşmak istiyorsam 
	// Sub class'ımda ( alt class ) super anahtar kelimesini kullanıyorum.
	// Bu aynı isimde olan özellikler ve metotlar için oldukça kullanışlı.
	
	
	// Örnek ; A ve B class'larında string veri tipinde name isminde 2 tane değişken var
	// ama bunların değerleri farklı ben 2'sini de beraber kullanmak istiyorsam
	// super class'daki name değişkenine erişmek için super keyword'unu kullanmam gerekecek.
	
	public void isimYazdir() {
		System.out.println(name); // a class'ındaki name yazılacak ekrana 
		System.out.println(super.name); // super anahtar kelimesi ile üst class'ımdaki name değişkenine eriştim ve onu ekrana yazdırıcam
	}
	
	// Bir  üst sınıfın constructor metodunu bir alt sınıfın constructor metodunda 
	// çağırmak , erişmek istiyorsak ozamanda super() metodunu kullanıyoruz
	
	public A(){
		super();// Git A'nın miras aldığı constructor'ı çağır
		// Ben bu sınıftan nesne türettiğim zaman oradaki başlangıç değerlerini objeme ata
		System.out.println("A sınıfının constructor metodu içerisinde super metodu kullanıldı ve değerler atandı");
	}
	// super() metodu kullanılarak constructor'ı çağıralan super class'ında miras aldığı bir class varsa
	// ozaman onunda constructor metodu çağılır.
	
}
