package controllers;

import interfaces.Alphabet;
import models.Rotor;

public class RotorController extends Rotor implements Alphabet{
	
	public static int controlSize(int j){
		if (j < 0)
			j = ALPHABET.length() + j;
		else if (j >= ALPHABET.length())
			j = 0 + j - ALPHABET.length();
		return j;
	}
	
	public void rotate (){
		if (this.getOffset() == (ALPHABET.length()-1)){
			this.setOffset(0);
		} else {
			this.setOffset(this.getOffset() + 1);
		}
	}	
	
	public char cipher (int prev_offset, int prev_ring_offset, char letter){
		int position = 0, positionB = 0, i;
		for (i = 0; i < ALPHABET.length(); i++){
			if (letter == ALPHABET.charAt(i)){
				position = i;
				break;
			}
		}
		position = position + this.getOffset() - prev_offset - prev_ring_offset;
		position = controlSize(position);
		positionB = position + this.getInnerRingPosition();
		positionB = controlSize(positionB);
		letter = this.getRotor().charAt(positionB);
		return letter;
	}
	
	public char reverse_cipher (char letter){
		int position = 0, i, j = 0;
		for (i = 0; i < ALPHABET.length(); i++){
			if (letter == ALPHABET.charAt(i)){
				j = i;
				break;
			}
		}
		j = j + this.getOffset() +this.getInnerRingPosition();
		j = controlSize(j);
		for (i = 0; i < this.getRotor().length(); i++){
			if (ALPHABET.charAt(j) == this.getRotor().charAt(i)){
				position = i;
				break;
			}
		}
		position = position - this.getOffset() -this.getInnerRingPosition(); 
		position = controlSize(position);
		letter = ALPHABET.charAt(position);
		return letter;
	}
	
}
