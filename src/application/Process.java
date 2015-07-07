package application;

import models.*;
import controllers.*;

public class Process {
	RotorController rightRotor = new RotorController();
	RotorController middleRotor = new RotorController();
	RotorController leftRotor = new RotorController();
	Rotor rotors = new Rotor();
	ReflectorController reflector = new ReflectorController();

	public char cipher (char letter){
		rightRotor.setRotor(rotors.getRotorIII());
		rightRotor.setNotch(rotors.getNotchIII());
		middleRotor.setRotor(rotors.getRotorII());
		middleRotor.setNotch(rotors.getNotchII());
		leftRotor.setRotor(rotors.getRotorI());
		leftRotor.setNotch(rotors.getNotchI());
		rightRotor.rotate();
		if (rightRotor.getOffset() == rightRotor.getNotch()){
			middleRotor.rotate();
			if (middleRotor.getOffset() == middleRotor.getNotch()){
				leftRotor.rotate();
			}
		}
		letter = rightRotor.cipher(0, letter);
		letter = middleRotor.cipher(rightRotor.getOffset(), letter);
		letter = leftRotor.cipher(middleRotor.getOffset(), letter);
		letter = reflector.reflect(leftRotor.getOffset(), letter);
		letter = leftRotor.reverse_cipher(letter);
		letter = middleRotor.reverse_cipher(letter);
		letter = rightRotor.reverse_cipher(letter);
		return letter;
	}
}
