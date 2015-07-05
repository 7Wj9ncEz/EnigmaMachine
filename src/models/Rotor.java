package models;

public class Rotor {
	private String III = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
	private String II = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	private String I = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	
	public String getRotorI(){
		return this.I;
	}
	
	public String getRotorII(){
		return this.II;
	}
	
	public String getRotorIII(){
		return this.III;
	}

}
