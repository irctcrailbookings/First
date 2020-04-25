package com.hitachi.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.hitachi.application.CheckLogPanel;
import com.hitachi.application.LoopCountPanel;
import com.hitachi.application.MakeTestCasePanel;
import com.hitachi.application.RadioPanel;
import javax.swing.JButton;

public class SwingMain {

	private JFrame frmStimulatorConsole;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain window = new SwingMain();
					window.frmStimulatorConsole.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStimulatorConsole = new JFrame("Create Your Own Automation");
		frmStimulatorConsole.setBounds(100, 100, 534, 482);
		frmStimulatorConsole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStimulatorConsole.getContentPane().setLayout(null);
		
		MakeTestCasePanel m = new MakeTestCasePanel();
		frmStimulatorConsole.getContentPane().add(m);
		
		RadioPanel radioPanel = new RadioPanel();
		radioPanel.setBounds(10, 221, 498, 33);
		frmStimulatorConsole.getContentPane().add(radioPanel);
		
		LoopCountPanel loopCountPanel = new LoopCountPanel();
		loopCountPanel.setLocation(10, 259);
		frmStimulatorConsole.getContentPane().add(loopCountPanel);
		
		/*JPanel panel = new JPanel();
		panel.setBounds(10, 296, 498, 80);
		frmStimulatorConsole.getContentPane().add(panel);
		panel.setLayout(null);*/
		
		/*JLabel lblNewLabel = new JLabel("Check in log(In a single Line)");
		lblNewLabel.setBounds(10, 11, 165, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(211, 11, 149, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(180, 45, 35, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(236, 45, 35, 23);
		panel.add(radioButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 44, 149, 25);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(297, 44, 149, 25);
		panel.add(textField_2);
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		radioButton_1.setBounds(374, 12, 35, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		radioButton_2.setBounds(435, 12, 35, 23);
		panel.add(radioButton_2);*/
		
		CheckLogPanel checkLogPanel = new CheckLogPanel();
		checkLogPanel.setLocation(10, 304);
		frmStimulatorConsole.getContentPane().add(checkLogPanel);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(30, 410, 89, 23);
		frmStimulatorConsole.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start");
		btnNewButton_1.setBounds(205, 410, 89, 23);
		frmStimulatorConsole.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stop");
		btnNewButton_2.setBounds(368, 410, 89, 23);
		frmStimulatorConsole.getContentPane().add(btnNewButton_2);
		
		
		
		
	}
}
