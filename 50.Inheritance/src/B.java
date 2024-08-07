
public class B extends C { // B sınıfı , C yi miras alıyor
	public String name = "Ali";
	public int bdegisken1;
	public int bdegisken2;
	
	public B() {
		System.out.println("B class'ı yapıcı metodu");	
	} 
	
	public B(String name) {
		super();// üst class'ın yapıcı metodunu çağırdık.( miras aldığım class'ın yapıcı metodu ) 
		this.name = name;
	}

	

	public B(int bdegisken1, int bdegisken2) { // B class'ımın yapıcı metoduna girilecek olan parametreleri al 
										// super metodu kullanarak çağırdım super class olan C classımın constructor'ının parameterelerine ata 
		super(bdegisken1,bdegisken2);
	}

	public void bsinifiMetodu() {
		System.out.println("B class'ı metodu çalıştı");
	}
	

	
	
	
}
