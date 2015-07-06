package application;

import javax.swing.JFrame;
import views.Machine;
import controllers.*;
import models.*;


public class Main {
	public static void main (String[] args){
		Rotor rotors = new Rotor();
		RotorController leftRotor = new RotorController();
		RotorController middleRotor = new RotorController();
		RotorController rightRotor = new RotorController();
		ReflectorController reflector = new ReflectorController();
		JFrame machine = new Machine();
		
	}
}
