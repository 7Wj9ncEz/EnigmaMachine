package models;

public class Rotor {
	private String III = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
	private String II = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	private String I = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	private String rotor;
	private int offset = 0;
	
	public String getRotorI(){
		return this.I;
	}
	
	public String getRotorII(){
		return this.II;
	}
	
	public String getRotorIII(){
		return this.III;
	}
	
	public void setRotor(String rotor){
		this.rotor = rotor;
	}
	
	public String getRotor(){
		return this.rotor;
	}
	
	public void setOffset(int offset){
		this.offset = offset;
	}
	
	public int getOffset(){
		return this.offset;
	}

}
