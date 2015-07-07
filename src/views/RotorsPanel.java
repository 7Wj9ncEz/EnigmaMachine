package views;

import javax.swing.*;

@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
public class RotorsPanel extends JFrame{
	
	JComboBox leftRotor;
	JComboBox middleRotor;
	JComboBox rightRotor;
	JPanel rotorsPanel;
	String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
						"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};

	public JPanel getRotorsPanel (){
		
		rotorsPanel = new JPanel();
		
		rightRotor = new JComboBox(numbers);
		middleRotor = new JComboBox(numbers);
		leftRotor = new JComboBox(numbers);
		
		rotorsPanel.add(rightRotor);
		rotorsPanel.add(middleRotor);
		rotorsPanel.add(leftRotor);
		
		return rotorsPanel;
	}

}
