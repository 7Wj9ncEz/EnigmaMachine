package views;

import java.awt.*;
import application.Process;

import javax.swing.*;

@SuppressWarnings("serial")
public class Output extends JFrame{
	static JTextArea outputArea;
	Process process = new Process();
	
	public JPanel getTextPanel(){
		JPanel textPanel = new JPanel();
		JLabel output = new JLabel("Output");
		textPanel.setLayout(new GridLayout(2,1));
		textPanel.setPreferredSize(new Dimension(900,250));
		textPanel.setSize(900,250);
		outputArea = new JTextArea("");
		outputArea.setEditable(false);
		textPanel.add(output);
		textPanel.add(outputArea);
		return textPanel;
	}
	
	public static void printLetter(char letter){
		outputArea.append(""+letter);
	}
	
	public static void eraseThings(){
		outputArea.setText("");
	}
}
