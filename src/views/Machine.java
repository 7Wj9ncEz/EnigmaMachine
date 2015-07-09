package views;

import java.awt.*;
import java.awt.event.*;
import application.Process;
import javax.swing.*;

@SuppressWarnings("serial")
public class Machine extends JFrame implements ActionListener{
	Lampboard lampboard = new Lampboard();
	Keyboard keyboard = new Keyboard();
	RotorsPanel rotorsPanel = new RotorsPanel();
	Plugboard plugboard = new Plugboard();
	JButton reset = new JButton ("Reset Settings");
	
	public Machine(){
		JPanel machine1 = new JPanel();
		JPanel machine2 = new JPanel();
		setTitle("Enigma Machine");
		setSize(900,400);
		setBackground(Color.white);
		setLayout(new GridLayout(1,2,25,1));
		setResizable(false);
		
		machine1.setLayout(new GridLayout(3,1));
		machine1.add(rotorsPanel.getRotorsPanel());
		machine1.add(lampboard.getLampboard());
		machine1.add(keyboard.getKeyboard());
		
		reset.addActionListener(this);
		
		machine2.setLayout(new BorderLayout(10,20));
		machine2.add("North", rotorsPanel.getRingsPanel());
		machine2.add("Center", plugboard.getPlugboard());
		machine2.add("South", reset);
		
		add(machine1);
		add(machine2);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == reset)
			Process.resetSettings();
	}
}
