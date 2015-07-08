package application;

import javax.swing.JFrame;

import views.Machine;


public class Main {
	public static void main (String[] args){
		JFrame machine = new Machine();
		Process.inicialSetting();
		machine.setVisible(true);
	}
}
