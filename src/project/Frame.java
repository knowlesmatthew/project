package project;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Frame {
	
	public Frame(){
		/*
		 * set Frame
		 * set Frame size
		 */
		JFrame frame = new JFrame("Eco system");
		frame.setSize(500,500);
		/*
		 * Set border layout
		 * use image as background
		 */
		frame.setLayout(new BorderLayout());
		frame.setContentPane(new JLabel(new ImageIcon("images/background.png")));
		/*
		 * set close operator
		 * set frame visible
		 */
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		Frame frame = new Frame();
	}
	
}
