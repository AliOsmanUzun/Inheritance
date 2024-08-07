package model;

public class Hayvan { // üst class ( super class ) / mirası veren class
   
	
	public Long id; 
	
	protected String hayvanIsmi;
	
	protected int yas;
	
	protected String renk;
	
	protected int ayakSayisi;

public Hayvan() {
System.out.println("Merhaba");
}	

public void sesVer() {
	System.out.println("Hayvan ses veriyor...");
}

}
