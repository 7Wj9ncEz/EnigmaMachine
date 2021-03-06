package models;

public class Rotor {
	private String V = "VZBRGITYUPSDNHLXAWMJQOFECK";
	private String IV = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
	private String III = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
	private String II = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	private String I = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	private String rotor;
	private int offset = 0;
	private int notchV = 26;
	private int notchIV = 10;
	private int notchIII = 22;
	private int notchII = 5;
	private int notchI = 17;
	private int notch;
	private int innerRingPosition = 0;
	
	public String getRotorI(){
		return this.I;
	}
	
	public String getRotorII(){
		return this.II;
	}
	
	public String getRotorIII(){
		return this.III;
	}
	
	public String getRotorIV(){
		return this.IV;
	}
	
	public String getRotorV(){
		return this.V;
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
	
	public int getNotchI(){
		return this.notchI;
	}
	
	public int getNotchII(){
		return this.notchII;
	}
	
	public int getNotchIII(){
		return this.notchIII;
	}
	
	public int getNotchIV(){
		return this.notchIV;
	}
	
	public int getNotchV(){
		return this.notchV;
	}
	
	public void setNotch(int notch){
		this.notch = notch;
	}
	
	public int getNotch(){
		return this.notch;
	}
	
	public int getInnerRingPosition(){
		return this.innerRingPosition;
	}
	
	public void setInnerRingPosition(int innerRingPosition){
		this.innerRingPosition = innerRingPosition;
	}
}
