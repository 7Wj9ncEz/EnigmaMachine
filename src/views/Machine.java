package views;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Machine extends JFrame{
	JPanel lampboard;
	Keyboard keyboard = new Keyboard();
	
	public Machine(){
		setTitle("Enigma Machine");
		setSize(450,400);
		setBackground(Color.white);
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		
		lampboard = new JPanel();
		lampboard.setBackground(new Color(255,0,0));
		
		add(lampboard);
		add(keyboard.getKeyboard());
		
	}
	
	
	
	
}
