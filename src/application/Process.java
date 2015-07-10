package application;

import java.util.*;

import views.Output;
import views.Plugboard;
import views.RotorsPanel;
import models.*;
import controllers.*;

public class Process {
	static RotorController rightRotor = new RotorController();
	static RotorController middleRotor = new RotorController();
	static RotorController leftRotor = new RotorController();
	static Rotor rotors = new Rotor();
	static ReflectorController reflector = new ReflectorController();
	static List<PlugController> plugs = new ArrayList<PlugController>();
	
	public static void createPlugs(){
		for (int i = 0; i < 10; i++)
			plugs.add(new PlugController('A', 'A'));
	}

	public static void inicialSetting(){
		createPlugs();
		rightRotor.setRotor(rotors.getRotorIII());
		rightRotor.setNotch(rotors.getNotchIII());
		middleRotor.setRotor(rotors.getRotorII());
		middleRotor.setNotch(rotors.getNotchII());
		leftRotor.setRotor(rotors.getRotorI());
		leftRotor.setNotch(rotors.getNotchI());
	}
	
	public static void resetSettings(){
		rightRotor.setRotor(rotors.getRotorIII());
		rightRotor.setNotch(rotors.getNotchIII());
		rightRotor.setOffset(0);
		rightRotor.setInnerRingPosition(0);
		middleRotor.setRotor(rotors.getRotorII());
		middleRotor.setNotch(rotors.getNotchII());
		middleRotor.setOffset(0);
		middleRotor.setInnerRingPosition(0);
		leftRotor.setRotor(rotors.getRotorI());
		leftRotor.setNotch(rotors.getNotchI());
		leftRotor.setOffset(0);
		leftRotor.setInnerRingPosition(0);
		RotorsPanel.resetSettings();
		for (int i = 0; i < plugs.size(); i++){
			plugs.get(i).setLetter1('A');
			plugs.get(i).setLetter2('A');
		}
		Plugboard.resetSettings();
		Output.eraseThings();
	}
	
	public static void setPlugs(int i, char letter1, char letter2){
		plugs.get(i).setLetter1(letter1);
		plugs.get(i).setLetter2(letter2);
	}
	
	public char applyPlugs(char letter){
		for (PlugController plug : plugs)
			letter = plug.swapLetters(letter);
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
				} else {
					if (rotor.equals("IV")){
						leftRotor.setRotor(rotors.getRotorIV());
						leftRotor.setNotch(rotors.getNotchIV());
					} else {
						if (rotor.equals("V")){
							leftRotor.setRotor(rotors.getRotorV());
							leftRotor.setNotch(rotors.getNotchV());
						}
					}
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
				}  else {
					if (rotor.equals("IV")){
						middleRotor.setRotor(rotors.getRotorIV());
						middleRotor.setNotch(rotors.getNotchIV());
					} else {
						if (rotor.equals("V")){
							middleRotor.setRotor(rotors.getRotorV());
							middleRotor.setNotch(rotors.getNotchV());
						}
					}
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
				} else {
					if (rotor.equals("IV")){
						rightRotor.setRotor(rotors.getRotorIV());
						rightRotor.setNotch(rotors.getNotchIV());
					} else {
						if (rotor.equals("V")){
							rightRotor.setRotor(rotors.getRotorV());
							rightRotor.setNotch(rotors.getNotchV());
						}
					}
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
	
	public static void setLeftInnerRingPosition (int num){
		num = 0 - num;
		num = RotorController.controlSize(num);
		leftRotor.setInnerRingPosition(num);
	}
	
	public static void setMiddleInnerRingPosition (int num){
		num = 0 - num;
		num = RotorController.controlSize(num);
		middleRotor.setInnerRingPosition(num);
	}
	
	public static void setRightInnerRingPosition (int num){
		num = 0 - num;
		num = RotorController.controlSize(num);
		rightRotor.setInnerRingPosition(num);
	}
	
	public char cipher (char letter){
		letter = applyPlugs(letter);
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
		letter = rightRotor.cipher(0, 0, letter);
		letter = middleRotor.cipher(rightRotor.getOffset(), rightRotor.getInnerRingPosition(), letter);
		letter = leftRotor.cipher(middleRotor.getOffset(), middleRotor.getInnerRingPosition(), letter);
		letter = reflector.reflect(leftRotor.getOffset(), leftRotor.getInnerRingPosition(), letter); 
		letter = leftRotor.reverse_cipher(letter);
		letter = middleRotor.reverse_cipher(letter);
		letter = rightRotor.reverse_cipher(letter);
		letter = applyPlugs(letter);
		return letter;
	}
	
}
