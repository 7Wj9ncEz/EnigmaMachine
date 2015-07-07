package views;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;

@SuppressWarnings("serial")
public class Lampboard extends JFrame {
	private static List<JLabel> lamps = new ArrayList<JLabel>();
	
	public JPanel getLampboard (){
		JPanel lampboard, lampboard1, lampboard2, lampboard3;
		String keyboardLetters = "QWERTZUIOASDFGHJKPYXCVBNML";
		
		lampboard1 = new JPanel();
		lampboard1.setLayout(new GridLayout(1,9));
		lampboard1.setBackground(Color.white);
		
		lampboard2 = new JPanel();
		lampboard2.setLayout(new GridLayout(1,8));
		lampboard2.setBackground(Color.white);
		
		lampboard3 = new JPanel();
		lampboard3.setLayout(new GridLayout(1,9));
		lampboard3.setBackground(Color.white);
		
		lampboard = new JPanel();
		lampboard.setLayout(new GridLayout(3,1));
		lampboard.setBackground(Color.black);
		
		for (int i = 0; i < keyboardLetters.length(); i++){
			JLabel label = new JLabel(""+keyboardLetters.charAt(i));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.lightGray);
			lamps.add(label);
			if (i <= 9)
				lampboard1.add(label);
			else if (i <= 16)
				lampboard2.add(label);
			else 
				lampboard3.add(label);
		}
		
		lampboard.add(lampboard1);
		lampboard.add(lampboard2);
		lampboard.add(lampboard3);
		
		return lampboard;
	}
	
	public static void lightLamp (char letter){
		for (JLabel label : lamps){
			if (label.getText().charAt(0) == letter)
				label.setForeground(Color.red);
			else
				label.setForeground(Color.lightGray);
		}
	}

}
