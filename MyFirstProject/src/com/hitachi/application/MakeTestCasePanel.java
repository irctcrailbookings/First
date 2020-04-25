package com.hitachi.application;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;

public class MakeTestCasePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2951156100858156653L;
	private DefaultListModel<String> allTestCasesList;
	private JList<String> allTestCases ;
	private DefaultListModel<String> selectedTestCaseList;
	private JList<String> selectedTestCase;

	public MakeTestCasePanel() {
		initialize();
	}

	private void initialize() {
		//setBorder(BorderFactory.createLineBorder(Color.blue));
		setBounds(10, 11, 498, 199);
		setLayout(null);

		addelementToallTestCasesList();
		allTestCases = new JList<String>(allTestCasesList);

		JScrollPane allTestCasescrollPane = new JScrollPane(allTestCases);
		allTestCasescrollPane.setBounds(10, 11, 179, 177);
		allTestCasescrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(allTestCasescrollPane);

		selectedTestCaseList = new DefaultListModel<String>();
		selectedTestCase = new JList<String>(selectedTestCaseList);
		JScrollPane selectedTestCasescrollPane = new JScrollPane(selectedTestCase);
		selectedTestCasescrollPane.setBounds(309, 11, 179, 177);
		selectedTestCasescrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(selectedTestCasescrollPane);

		BtnMovetoSeletedCases btnMovetoSeletedCases = new BtnMovetoSeletedCases();
		btnMovetoSeletedCases.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent var1) {
				if(!allTestCases.isSelectionEmpty()){
					 selectedTestCaseList.addElement(allTestCases.getSelectedValue());
				 }
			 }	
		});
		add(btnMovetoSeletedCases);

		
		BtnRemoveFrmSelectedTestCases btnRemoveFrmSelectedTestCases = new BtnRemoveFrmSelectedTestCases();
		btnRemoveFrmSelectedTestCases.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent var1) {
				if(!allTestCases.isSelectionEmpty()){
					 selectedTestCaseList.remove(selectedTestCase.getSelectedIndex());
				 }
			}
		});
		add(btnRemoveFrmSelectedTestCases);

		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent var1) {
				 selectedTestCaseList.removeAllElements();
			}
		});
		btnReset.setBounds(210, 131, 89, 23);
		add(btnReset);
	}

	public void addelementToallTestCasesList(){
		allTestCasesList = new DefaultListModel<String>();
		allTestCasesList.addElement("Predict");
		allTestCasesList.addElement("Volume");
		allTestCasesList.addElement("GuideShot");
		allTestCasesList.addElement("Normal");
		allTestCasesList.addElement("DoubleSingleScanogram");
		allTestCasesList.addElement("SingleScanogram");
		allTestCasesList.addElement("RegisterUser");
		allTestCasesList.addElement("EndExam");
		allTestCasesList.addElement("Completed");
		allTestCasesList.addElement("+1");
		allTestCasesList.addElement("+2");
		allTestCasesList.addElement("+5");
		allTestCasesList.addElement("TestBeforeConfirm");
		allTestCasesList.addElement("PerformScan");
		allTestCasesList.addElement("TestAfterConfirm");
		allTestCasesList.addElement("TestLog");

	}

	public DefaultListModel<String> getAllTestCasesList() {
		return allTestCasesList;
	}

	public void setAllTestCasesList(DefaultListModel<String> allTestCasesList) {
		this.allTestCasesList = allTestCasesList;
	}

	public JList<String> getAllTestCases() {
		return allTestCases;
	}

	public void setAllTestCases(JList<String> allTestCases) {
		this.allTestCases = allTestCases;
	}

	public DefaultListModel<String> getSelectedTestCaseList() {
		return selectedTestCaseList;
	}

	public void setSelectedTestCaseList(DefaultListModel<String> selectedTestCaseList) {
		this.selectedTestCaseList = selectedTestCaseList;
	}

	public JList<String> getSelectedTestCase() {
		return selectedTestCase;
	}

	public void setSelectedTestCase(JList<String> selectedTestCase) {
		this.selectedTestCase = selectedTestCase;
	}

}
