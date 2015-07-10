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
	Output output = new Output();
	
	public Machine(){
		JPanel machine0 = new JPanel();
		JPanel machine1 = new JPanel();
		JPanel machine2 = new JPanel();
		setTitle("Enigma Machine");
		setSize(950,650);
		setLayout(new FlowLayout());
		setBackground(Color.white);
		setResizable(false);
		
		machine0.setLayout(new GridLayout(1,2,25,1));
		
		machine1.setLayout(new GridLayout(3,1));
		machine1.add(rotorsPanel.getRotorsPanel());
		machine1.add(lampboard.getLampboard());
		machine1.add(keyboard.getKeyboard());
		
		reset.addActionListener(this);
		
		machine2.setLayout(new BorderLayout(10,20));
		machine2.add("North", rotorsPanel.getRingsPanel());
		machine2.add("Center", plugboard.getPlugboard());
		machine2.add("South", reset);
		
		machine0.add(machine1);
		machine0.add(machine2);
		
		add(machine0);
		add(output.getTextPanel());
		
		
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
