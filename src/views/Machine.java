package views;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Machine extends JFrame{
	Lampboard lampboard = new Lampboard();
	Keyboard keyboard = new Keyboard();
	RotorsPanel rotorsPanel = new RotorsPanel();
	
	public Machine(){
		setTitle("Enigma Machine");
		setSize(450,400);
		setBackground(Color.white);
		setVisible(true);
		setLayout(new GridLayout(3, 1));
		
		add(rotorsPanel.getRotorsPanel());
		add(lampboard.getLampboard());
		add(keyboard.getKeyboard());
		
	}
	
	
	
	
}
