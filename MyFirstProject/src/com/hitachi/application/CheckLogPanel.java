package com.hitachi.application;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckLogPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8675332525792864186L;
	private JTextField wordOne;
	private JTextField wordTwo;
	private JTextField wordThree;

	public CheckLogPanel() {
		initialize();
	}

	private void initialize() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBounds(10, 296, 498, 80);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Check in log(In a single Line)");
		lblNewLabel.setBounds(10, 11, 165, 25);
		add(lblNewLabel);
		
		wordOne = new JTextField();
		wordOne.setBounds(211, 11, 149, 25);
		add(wordOne);
		wordOne.setColumns(10);
		
		JRadioButton rdbtnAnd = new JRadioButton("&");
		JRadioButton rdbtnOr = new JRadioButton("OR");
		ButtonGroup bG = new ButtonGroup();
		bG.add(rdbtnAnd);
		bG.add(rdbtnOr);
		rdbtnAnd.setBounds(180, 45, 35, 23);
		add(rdbtnAnd);
		rdbtnOr.setBounds(236, 45, 55, 23);
		add(rdbtnOr);
		
		wordTwo = new JTextField();
		wordTwo.setColumns(10);
		wordTwo.setBounds(10, 44, 149, 25);
		add(wordTwo);
		
		wordThree = new JTextField();
		wordThree.setColumns(10);
		wordThree.setBounds(297, 44, 149, 25);
		add(wordThree);
		
		JRadioButton rdbtnAndSecond = new JRadioButton("&");
		JRadioButton rdbtnOrSecond = new JRadioButton("OR");
		ButtonGroup bGSecond = new ButtonGroup();
		bGSecond.add(rdbtnAnd);
		bGSecond.add(rdbtnOr);
		rdbtnAndSecond.setBounds(374, 12, 35, 23);
		add(rdbtnAndSecond);
		rdbtnOrSecond.setBounds(435, 12, 57, 23);
		add(rdbtnOrSecond);
		
	}

}
