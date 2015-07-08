package application;

import views.RotorsPanel;
import models.*;
import controllers.*;

public class Process {
	static RotorController rightRotor = new RotorController();
	static RotorController middleRotor = new RotorController();
	static RotorController leftRotor = new RotorController();
	static Rotor rotors = new Rotor();
	ReflectorController reflector = new ReflectorController();

	public static void inicialSetting(){
		rightRotor.setRotor(rotors.getRotorIII());
		rightRotor.setNotch(rotors.getNotchIII());
		middleRotor.setRotor(rotors.getRotorII());
		middleRotor.setNotch(rotors.getNotchII());
		leftRotor.setRotor(rotors.getRotorI());
		leftRotor.setNotch(rotors.getNotchI());
	}
	
	public char cipher (char letter){
		
		rightRotor.rotate();
		RotorsPanel.setRightRotation(rightRotor.getOffset());
		if (rightRotor.getOffset() == rightRotor.getNotch()){
			middleRotor.rotate();
			RotorsPanel.setMiddleRotation(middleRotor.getOffset());
			if (middleRotor.getOffset() == middleRotor.getNotch()){
				leftRotor.rotate();
				RotorsPanel.setLeftRotation(leftRotor.getOffset());
			}
		} else {
			if (middleRotor.getOffset() == middleRotor.getNotch()-1){
				middleRotor.rotate();
				RotorsPanel.setMiddleRotation(middleRotor.getOffset());
				leftRotor.rotate();
				RotorsPanel.setLeftRotation(leftRotor.getOffset());
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
	
	public static void setLeftRotor(String rotor){
		if (rotor.equals("I")){
			leftRotor.setRotor(rotors.getRotorI());
			leftRotor.setNotch(rotors.getNotchI());
		} else { 
			if (rotor.equals("II")){
				leftRotor.setRotor(rotors.getRotorII());
				leftRotor.setNotch(rotors.getNotchII());
			} else { 
				if (rotor.equals("III")){
					leftRotor.setRotor(rotors.getRotorIII());
					leftRotor.setNotch(rotors.getNotchIII());
				}
			}
		}
	}
	
	public static void setMiddleRotor(String rotor){
		if (rotor.equals("I")){
			middleRotor.setRotor(rotors.getRotorI());
			middleRotor.setNotch(rotors.getNotchI());
		} else { 
			if (rotor.equals("II")){
				middleRotor.setRotor(rotors.getRotorII());
				middleRotor.setNotch(rotors.getNotchII());
			} else { 
				if (rotor.equals("III")){
					middleRotor.setRotor(rotors.getRotorIII());
					middleRotor.setNotch(rotors.getNotchIII());
				}
			}
		}
	}
	
	public static void setRightRotor(String rotor){
		if (rotor.equals("I")){
			rightRotor.setRotor(rotors.getRotorI());
			rightRotor.setNotch(rotors.getNotchI());
		} else { 
			if (rotor.equals("II")) {
				rightRotor.setRotor(rotors.getRotorII());
				rightRotor.setNotch(rotors.getNotchII());
			} else { 
				if (rotor.equals("III")) {
					rightRotor.setRotor(rotors.getRotorIII());
					rightRotor.setNotch(rotors.getNotchIII());
				}
			}
		}
	}
	
	public static void setLeftRotation (int num){
		leftRotor.setOffset(num);
	}
	
	public static void setMiddleRotation (int num){
		middleRotor.setOffset(num);
	}
	
	public static void setRightRotation (int num){
		rightRotor.setOffset(num);
	}
}
