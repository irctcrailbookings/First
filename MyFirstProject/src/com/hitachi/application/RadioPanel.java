package com.hitachi.application;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioPanel extends JPanel {

	private static final long serialVersionUID = -2709697182820387107L;


	public RadioPanel() {
		initialize();
	}

	private void initialize() {
		setBounds(10, 221, 498, 42);
		setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(null);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("Choose way to select Protocol : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 7, 222, 24);
		add(lblNewLabel);

		JRadioButton rdbOrdered = new JRadioButton("Ordered");
		JRadioButton rdbRandom = new JRadioButton("Random");
		ButtonGroup bG = new ButtonGroup();
		bG.add(rdbOrdered);
		bG.add(rdbRandom);
		rdbOrdered.setBounds(238, 7, 109, 23);
		add(rdbOrdered);
		rdbRandom.setBounds(370, 7, 109, 23);
		add(rdbRandom);
	}

}
