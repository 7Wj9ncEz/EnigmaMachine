package controllers;

import interfaces.Alphabet;
import models.Reflector;

public class ReflectorController extends Reflector implements Alphabet{

	public char reflect (char letter){
		int i, position = 0;
		for (i = 0; i < ALPHABET.length(); i++){
			if (letter == ALPHABET.charAt(i)){
				position = i;
				break;
			}
		}
		letter = getReflector().charAt(position);
		return letter;
	}
}
