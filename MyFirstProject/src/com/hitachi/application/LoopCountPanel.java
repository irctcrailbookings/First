package com.hitachi.application;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoopCountPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8391456690988827379L;
	private JTextField textField;

	public LoopCountPanel() {
		initialize();
	}

	private void initialize() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBounds(10, 252, 498, 39);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Number of time loop need to be executed :");
		lblNewLabel.setBounds(10, 9, 272, 25);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(304, 6, 103, 28);
		add(textField);
		textField.setColumns(10);
	}


}
