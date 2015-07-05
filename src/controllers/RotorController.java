package controllers;

import interfaces.Alphabet;
import models.Rotor;

public class RotorController extends Rotor implements Alphabet{
	
	public void rotate (){
		if (this.getOffset() == (ALPHABET.length()-1)){
			this.setOffset(0);
		} else {
			this.setOffset(this.getOffset() + 1);
		}
	}
	
	public char cipher (char letter){
		int position = 0, i;
		for (i = 0; i < ALPHABET.length(); i++){
			if (letter == ALPHABET.charAt(i)){
				position = i;
				break;
			}
		}
		this.rotate();
		letter = this.getRotor().charAt(position + this.getOffset());
		
		return letter;
	}
	
}
