package views;

import java.awt.GridLayout;
import application.Process;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;

import javax.swing.*;

@SuppressWarnings({"rawtypes","serial", "unchecked"})
public class Plugboard extends JFrame implements ItemListener{
	List<JComboBox> plugList = new ArrayList<JComboBox>();
	List<JComboBox> counterPlugList = new ArrayList<JComboBox>();
	public JPanel getPlugboard(){
		JPanel plugboard = new JPanel();
		String[] Alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		plugboard.setLayout(new GridLayout(10,3));
		for (int i = 0; i < 10; i++){
			JLabel label = new JLabel("Plug " + (i+1));
			JComboBox plug = new JComboBox(Alphabet);
			plug.setSelectedIndex(i);
			plug.addItemListener(this);
			plugList.add(plug);
			JComboBox plug2 = new JComboBox(Alphabet);
			plug2.setSelectedIndex(i);
			plug2.addItemListener(this);
			counterPlugList.add(plug2);
			label.setLabelFor(plug);
			plugboard.add(label);
			plugboard.add(plug);
			plugboard.add(plug2);
		}
		
		return plugboard;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		for (int i = 0; i < plugList.size(); i++){
			Process.setPlugs(i, plugList.get(i).getSelectedItem().toString().charAt(0), 
							counterPlugList.get(i).getSelectedItem().toString().charAt(0));
		}
	}

}
