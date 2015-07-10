package views;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import application.Process;

import javax.swing.*;

@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
public class RotorsPanel extends JFrame implements ItemListener{
	static JComboBox leftRotation, middleRotation, rightRotation, leftRotor, middleRotor, rightRotor,
					leftInnerRing, middleInnerRing, rightInnerRing;
	
	public JPanel getRotorsPanel (){
		JPanel rotorsPanel = new JPanel();;
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
							"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};
		String[] rotors = {"I", "II", "III", "IV", "V"};
		leftRotor = new JComboBox(rotors);
		leftRotor.addItemListener(this);
		leftRotor.setSelectedIndex(0);
		middleRotor = new JComboBox(rotors);
		middleRotor.addItemListener(this);
		middleRotor.setSelectedIndex(1);
		rightRotor = new JComboBox(rotors);
		rightRotor.addItemListener(this);
		rightRotor.setSelectedIndex(2);
		JLabel left = new JLabel("Left");
		JLabel middle = new JLabel("Middle");
		JLabel right = new JLabel("Right");
		
		rightRotation = new JComboBox(numbers);
		rightRotation.addItemListener(this);
		middleRotation = new JComboBox(numbers);
		middleRotation.addItemListener(this);
		leftRotation = new JComboBox(numbers);
		leftRotation.addItemListener(this);
		
		left.setHorizontalAlignment(SwingConstants.CENTER);
		middle.setHorizontalAlignment(SwingConstants.CENTER);
		right.setHorizontalAlignment(SwingConstants.CENTER);
		
		rotorsPanel.setLayout(new GridLayout(3,3,50,20));
		rotorsPanel.add(left);
		rotorsPanel.add(middle);
		rotorsPanel.add(right);
		rotorsPanel.add(leftRotor);
		rotorsPanel.add(middleRotor);
		rotorsPanel.add(rightRotor);
		rotorsPanel.add(leftRotation);
		rotorsPanel.add(middleRotation);
		rotorsPanel.add(rightRotation);
		
		return rotorsPanel;
	}
	
	public static void setRightRotation(int number){
		rightRotation.setSelectedIndex(number);
	}
	
	public static void setMiddleRotation(int number){
		middleRotation.setSelectedIndex(number);
	}
	
	public static void setLeftRotation(int number){
		leftRotation.setSelectedIndex(number);
	}
	
	public JPanel getRingsPanel(){
		JPanel ringsPanel = new JPanel();
		JLabel left, middle, right;
		String[] positions = {"A-01", "B-02", "C-03", "D-04", "E-05", "F-06", "G-07", "H-08", "I-09",
							"J-10", "K-11", "L-12", "M-13", "N-14", "O-15", "P-16", "Q-17", "R-18",
							"S-19", "T-20", "U-21", "V-22", "W-23", "X-24", "Y-25", "Z-26"};
		left = new JLabel("Left Inner Ring");
		middle = new JLabel("Middle Inner Ring");
		right = new JLabel("Right Inner Ring");
		leftInnerRing = new JComboBox(positions);
		leftInnerRing.addItemListener(this);
		middleInnerRing = new JComboBox(positions);
		middleInnerRing.addItemListener(this);
		rightInnerRing = new JComboBox(positions);
		rightInnerRing.addItemListener(this);
		ringsPanel.setLayout(new GridLayout(2,3));
		ringsPanel.add(left);
		ringsPanel.add(middle);
		ringsPanel.add(right);
		ringsPanel.add(leftInnerRing);
		ringsPanel.add(middleInnerRing);
		ringsPanel.add(rightInnerRing);
		return ringsPanel;
	}
	
	public static void resetSettings(){
		leftRotation.setSelectedIndex(0);
		middleRotation.setSelectedIndex(0);
		rightRotation.setSelectedIndex(0);
		leftRotor.setSelectedIndex(0);
		middleRotor.setSelectedIndex(1);
		rightRotor.setSelectedIndex(2);
		leftInnerRing.setSelectedIndex(0);
		middleInnerRing.setSelectedIndex(0);
		rightInnerRing.setSelectedIndex(0);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rightRotation)
			Process.setRightRotation(rightRotation.getSelectedIndex());
		else if (e.getSource() == middleRotation)
			Process.setMiddleRotation(middleRotation.getSelectedIndex());
		else if (e.getSource() == leftRotation)
			Process.setLeftRotation(leftRotation.getSelectedIndex());
		else if (e.getSource() == leftRotor)
			Process.setLeftRotor(leftRotor.getSelectedItem().toString());
		else if (e.getSource() == middleRotor)
			Process.setMiddleRotor(middleRotor.getSelectedItem().toString());
		else if (e.getSource() == rightRotor)
			Process.setRightRotor(rightRotor.getSelectedItem().toString());
		else if (e.getSource() == rightInnerRing)
			Process.setRightInnerRingPosition(rightInnerRing.getSelectedIndex());
		else if (e.getSource() == middleInnerRing)
			Process.setMiddleInnerRingPosition(middleInnerRing.getSelectedIndex());
		else if (e.getSource() == leftInnerRing)
			Process.setLeftInnerRingPosition(leftInnerRing.getSelectedIndex());
	}

}