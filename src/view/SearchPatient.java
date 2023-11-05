package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SearchPatient extends JFrame {
	
	private static JTextField  patient;
	private JButton seachPatient; 
	
	public SearchPatient() {
		
		setTitle("Buscar Paciente");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		
		JPanel sheetUpper = new JPanel();
		sheetUpper.setLayout(new FlowLayout());
		JLabel titleMain = new JLabel("Planilla Paciente");
		titleMain.setFont(new Font("Arial", Font.BOLD, 30));
		sheetUpper.add(titleMain);
		
		JPanel centralSheet = new JPanel();
		centralSheet.setLayout(new BorderLayout());
	
		JPanel sheetCentralIncomeData = new JPanel();
		sheetCentralIncomeData.setLayout(new GridLayout(3, 3));
		centralSheet.add(sheetCentralIncomeData, BorderLayout.NORTH);
		
		JLabel msgDNI = new JLabel("DNI");
		sheetCentralIncomeData.add(msgDNI);
		patient = new JTextField();
		sheetCentralIncomeData.add(patient);
		 
		
		
		
		JPanel bottomSheet = new JPanel();
		bottomSheet.setLayout(new FlowLayout());
		seachPatient = new JButton("Buscar"); 
		bottomSheet.add(seachPatient);
		 
		add(sheetUpper, BorderLayout.NORTH);
		add(centralSheet, BorderLayout.CENTER);
		add(bottomSheet, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
