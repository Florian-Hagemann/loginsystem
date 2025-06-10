package loginsystem;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.*;

/*
 * GUI for loginsystem
 * 
 * Date: 041021
 * Author: Florian
 */

public class GUI extends JFrame {
	
	// Setting up JFrame and its properties
	private JFrame f;
	private String name;
	private int length;
	private int height;
	
	// Create JComponents
	private JTextField fieldName;
	private JTextField fieldPassword;
	
	private JLabel labelTitle;
	private JLabel labelName;
	private JLabel labelPassword;
	
	private JButton buttonLogin;
	private JButton buttonSignIn;
	
	public GUI(String _name, int _length, int _height) {
		
		// Getting JFrame parameters
		name = _name;
		length = _length;
		height = _height;
		f = new JFrame();
		
		// setting up JComponents
		fieldName = new JTextField();
		fieldPassword = new JTextField();
		
		labelTitle = new JLabel("Login");
		labelName = new JLabel("Name: ");
		labelPassword = new JLabel("Password: ");
		
		buttonLogin = new JButton("LOGIN");
		buttonSignIn = new JButton("SIGN IN");
		
		// initialise everything
		init();
		
	}
	
	private void init() {
		
		// initiate JFrame
		f.setSize(length, height);
		f.setName(name);
		f.setBackground(Color.black);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// setup Layoutmanager
		f.setLayout(new GridLayout(8, 1, 2, 2));
		
		// Setting frame to be visible
		f.setVisible(true);
		
		//initiate & Add JComponents
		f.add(labelTitle);
		
		f.add(labelName);
		
		f.add(fieldName);
		
		f.add(labelPassword);
		
		f.add(fieldPassword);
		
		buttonLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.login(fieldName.getText(), fieldPassword.getText())) {
					
					showMessageDialog(null, "Loged in!\nHello, " + fieldName.getText() + ".");
					
				} else {
					
					showMessageDialog(null, "Password or username incorrect");
					
				}
				
			}
			
		});
		f.add(buttonLogin);
		buttonSignIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.signin(fieldName.getText(), fieldPassword.getText())) {
					showMessageDialog(null, "Signed in succesfully!");
				} else {
					showMessageDialog(null, "Username already exists!");
				}
			}
			
		});
		f.add(buttonSignIn);
		
	}

}
