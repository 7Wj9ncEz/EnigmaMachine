package controllers;

import models.Plug;

public class PlugController extends Plug {
	
	public PlugController (char letter1, char letter2){
		setLetter1(letter1);
		setLetter2(letter2);
	}
	
	public char swapLetters (char letter){
		if (letter == this.getLetter1())
			letter = this.getLetter2();
		else if (letter == this.getLetter2())
			letter = this.getLetter1();
		return letter;
	}
}
