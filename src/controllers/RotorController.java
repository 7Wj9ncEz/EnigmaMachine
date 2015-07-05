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
	
	public char cipher (int prev_offset, char letter){
		int position = 0, i, j;
		for (i = 0; i < ALPHABET.length(); i++){
			j = i - prev_offset;
			if (j < 0)
				j = ALPHABET.length()+j;
			if (letter == ALPHABET.charAt(j)){
				position = j;
				break;
			}
		}
		position = position + this.getOffset() - prev_offset;
		if (position < 0)
			position = ALPHABET.length() + position;
		else if (position >= ALPHABET.length())
			position = -1 + position;
		letter = this.getRotor().charAt(position);
		return letter;
	}
	
}
