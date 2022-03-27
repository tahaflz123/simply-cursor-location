package org.cursorposition;

import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;

public class Main{
	
	
	
	public static void main(String[] args) {
		new Main().start();
	}

	public void start() {
		Dimension dimension = new Dimension(200,70);
		Window window = new Window(dimension, this.location());
		while(true) {
			window.setLabelText(this.location().toString());
		}
	}
	
	
	public Point location() {
		return MouseInfo.getPointerInfo().getLocation();
	}
	
	
	
	
}
