package controllers;

import interfaces.Alphabet;
import models.Reflector;

public class ReflectorController extends Reflector implements Alphabet{

	public char reflect (int prev_offset, char letter){
		int i, j, position = 0;
		for (i = 0; i < ALPHABET.length(); i++){
			j = i + prev_offset;
			j = RotorController.controlSize(j);
			if (letter == ALPHABET.charAt(j)){
				position = i;
				break;
			}
		}
		letter = getReflector().charAt(position);
		return letter;
	}
}
