package models;

public class Reflector {
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String reflectorB = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
	
	public String getReflector(){
		return this.reflectorB;
	}
	
	public String getAlphabet(){
		return this.alphabet;
	}

}
