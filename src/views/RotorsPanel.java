package views;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import application.Process;
import javax.swing.*;

@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
public class RotorsPanel extends JFrame implements ItemListener{
	
	static JComboBox leftRotor;
	static JComboBox middleRotor;
	static JComboBox rightRotor;
	JPanel rotorsPanel;
	String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
						"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};

	public JPanel getRotorsPanel (){
		
		rotorsPanel = new JPanel();
		
		rightRotor = new JComboBox(numbers);
		rightRotor.addItemListener(this);
		middleRotor = new JComboBox(numbers);
		middleRotor.addItemListener(this);
		leftRotor = new JComboBox(numbers);
		leftRotor.addItemListener(this);
		
		rotorsPanel.add(leftRotor);
		rotorsPanel.add(middleRotor);
		rotorsPanel.add(rightRotor);
		
		return rotorsPanel;
	}
	
	public static void setRightRotation(int number){
		rightRotor.setSelectedIndex(number);
	}
	
	public static void setMiddleRotation(int number){
		middleRotor.setSelectedIndex(number);
	}
	
	public static void setLeftRotation(int number){
		leftRotor.setSelectedIndex(number);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rightRotor)
			Process.setRightRotation(rightRotor.getSelectedIndex());
		else if (e.getSource() == middleRotor)
			Process.setMiddleRotation(middleRotor.getSelectedIndex());
		else
			Process.setLeftRotation(leftRotor.getSelectedIndex());
		
	}

}
