package views;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import application.Process;

import javax.swing.*;

@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
public class RotorsPanel extends JFrame implements ItemListener{
	static JComboBox leftRotor, middleRotor, rightRotor, lRotor, mRotor, rRotor;
	
	public JPanel getRotorsPanel (){
		JPanel rotorsPanel = new JPanel();;
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
							"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};
		String[] rotors = {"I", "II", "III"};
		lRotor = new JComboBox(rotors);
		lRotor.addItemListener(this);
		lRotor.setSelectedIndex(0);
		mRotor = new JComboBox(rotors);
		mRotor.addItemListener(this);
		mRotor.setSelectedIndex(1);
		rRotor = new JComboBox(rotors);
		rRotor.addItemListener(this);
		rRotor.setSelectedIndex(2);
		JLabel left = new JLabel("Left");
		JLabel middle = new JLabel("Middle");
		JLabel right = new JLabel("Right");
		
		rightRotor = new JComboBox(numbers);
		rightRotor.addItemListener(this);
		middleRotor = new JComboBox(numbers);
		middleRotor.addItemListener(this);
		leftRotor = new JComboBox(numbers);
		leftRotor.addItemListener(this);
		
		left.setHorizontalAlignment(SwingConstants.CENTER);
		middle.setHorizontalAlignment(SwingConstants.CENTER);
		right.setHorizontalAlignment(SwingConstants.CENTER);
		
		rotorsPanel.setLayout(new GridLayout(3,3,50,20));
		rotorsPanel.add(left);
		rotorsPanel.add(middle);
		rotorsPanel.add(right);
		rotorsPanel.add(lRotor);
		rotorsPanel.add(mRotor);
		rotorsPanel.add(rRotor);
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
		else if (e.getSource() == leftRotor)
			Process.setLeftRotation(leftRotor.getSelectedIndex());
		else if (e.getSource() == lRotor)
			Process.setLeftRotor(lRotor.getSelectedItem().toString());
		else if (e.getSource() == mRotor)
			Process.setMiddleRotor(mRotor.getSelectedItem().toString());
		else
			Process.setRightRotor(rRotor.getSelectedItem().toString());
		
	}

}