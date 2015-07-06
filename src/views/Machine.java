package views;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Machine extends JFrame{
	Lampboard lampboard = new Lampboard();
	Keyboard keyboard = new Keyboard();
	
	public Machine(){
		setTitle("Enigma Machine");
		setSize(450,400);
		setBackground(Color.white);
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		
		add(lampboard.getLampboard());
		add(keyboard.getKeyboard());
		
	}
	
	
	
	
}
