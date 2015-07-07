package views;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		setLayout(new GridLayout(3, 1));
		setResizable(false);
		add(rotorsPanel.getRotorsPanel());
		add(lampboard.getLampboard());
		add(keyboard.getKeyboard());
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
	
	
	
	
}
