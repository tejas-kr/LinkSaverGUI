package com.linksaver.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class LinkSaver extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinkSaver frame = new LinkSaver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LinkSaver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUrl = new JLabel("Enter URL");
		lblEnterUrl.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEnterUrl.setBounds(39, 12, 88, 35);
		contentPane.add(lblEnterUrl);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEnterName.setBounds(39, 89, 111, 35);
		contentPane.add(lblEnterName);
		
		textField = new JTextField();
		textField.setBounds(145, 12, 287, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 81, 287, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SaveIntoFile saveIntoFile = new SaveIntoFile(textField.getText(), textField_1.getText());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(162, 185, 117, 25);
		contentPane.add(btnAdd);
	}
}
