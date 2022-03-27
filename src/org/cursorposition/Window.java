package org.cursorposition;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {
	
	JFrame frame = new JFrame("Mouse");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	
	public Window(Dimension dimension, Point location) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(dimension);
		
		panel.setSize(dimension);
		panel.setVisible(true);
		
		label.setText(location.toString());
		label.setVisible(true);
		label.setSize(dimension);
		
		
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
	
	public void setLabelText(String text) {
		this.label.setText(text);
	}
	
	

}
