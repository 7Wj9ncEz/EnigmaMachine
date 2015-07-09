package views;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import application.Process;

@SuppressWarnings("serial")
public class Keyboard extends JFrame implements MouseListener{
	Process process = new Process();
	
	public JPanel getKeyboard (){
		JPanel keyboard, keyboard1, keyboard2, keyboard3;
		String keyboardLetters = "QWERTZUIOASDFGHJKPYXCVBNML";
		keyboard1 = new JPanel();
		keyboard2 = new JPanel();
		keyboard3 = new JPanel();
		keyboard = new JPanel();
		keyboard.setLayout(new GridLayout(3,9));
		for (int i = 0; i < keyboardLetters.length(); i++){
			JButton key = new JButton(""+keyboardLetters.charAt(i));
			key.addMouseListener(this);
			if (i <= 8)
				keyboard1.add(key);
			else if (i <= 16)
				keyboard2.add(key);
			else
				keyboard3.add(key);
		}
		keyboard.add(keyboard1);
		keyboard.add(keyboard2);
		keyboard.add(keyboard3);
		return keyboard;
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		Lampboard.lightOff();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		char letter;
		letter = btn.getText().charAt(0);
		letter = process.cipher(btn.getText().charAt(0));
		Lampboard.lightLamp(letter);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
