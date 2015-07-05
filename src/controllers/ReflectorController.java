package controllers;

import models.Reflector;

public class ReflectorController extends Reflector{

	public char reflect (char letter){
		int i, position = 0;
		for (i = 0; i < getAlphabet().length(); i++){
			if (letter == getAlphabet().charAt(i)){
				position = i;
				break;
			}
		}
		letter = getReflector().charAt(position);
		return letter;
	}
}
