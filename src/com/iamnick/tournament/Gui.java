package com.iamnick.tournament;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Gui {

	JFrame frame = new JFrame("Fussy Tournament");//top of the window to ya!
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel fighter1 = new JLabel("1amnick");
	JLabel vsSpace = new JLabel("  VS  ");
	JLabel fighter2 = new JLabel("Mikto1000");
	Font font = loadFont("direwolfexpand.ttf");
	


	public Gui(){

	
		fighter1.setFont(font);
		fighter2.setFont(font);
		vsSpace.setFont(font);
		
		panel.add(fighter1);
		panel.add(vsSpace);
		panel.add(fighter2);
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		panel.setBackground(Color.RED);
		frame.add(panel);
	//	frame.add(panel2); //make sure this bar shows under the time settings
	//	frame.add(panel3);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER)); //i think this is magic
		frame.setSize(400, 300); //random numbers go here
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private Font loadFont(String fontName){

		try {
		     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		     Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontName));
		     ge.registerFont(font);
		     font = font.deriveFont(24.0f);
		     
		     return font;
		} catch (IOException|FontFormatException e) {
		     //Handle exception
		}
		return null;
	}
	


}