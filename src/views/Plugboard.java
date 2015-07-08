package views;

import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class Plugboard extends JFrame {
	JPanel plugboard = new JPanel();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JPanel getPlugboard(){
		String[] Alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		plugboard.setLayout(new GridLayout(10,3));
		for (int i = 0; i < 10; i++){
			JLabel label = new JLabel("Plug " + (i+1));
			JComboBox plug = new JComboBox(Alphabet);
			JComboBox plug2 = new JComboBox(Alphabet);
			label.setLabelFor(plug);
			plugboard.add(label);
			plugboard.add(plug);
			plugboard.add(plug2);
		}
		
		return plugboard;
	}

}
