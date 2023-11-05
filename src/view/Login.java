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

import controller.ControlLogin;

public class Login extends JFrame{

	private static JTextField  dniUser;
	private JPasswordField inPass;
	private JButton login; 
	
	public Login() {
		
		setTitle("Abstract");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		
		
		JPanel sheetUpper = new JPanel();
		sheetUpper.setLayout(new FlowLayout());
		JLabel titleMain = new JLabel("SISTEMA CLÍNICO");
		titleMain.setFont(new Font("Arial", Font.BOLD, 30));
		sheetUpper.add(titleMain);
		
		JPanel centralSheet = new JPanel();
		centralSheet.setLayout(new BorderLayout());
	
		JPanel sheetCentralIncomeData = new JPanel();
		sheetCentralIncomeData.setLayout(new GridLayout(3, 3));
		centralSheet.add(sheetCentralIncomeData, BorderLayout.NORTH);
		
		JLabel msgDNI = new JLabel("DNI");
		sheetCentralIncomeData.add(msgDNI);
		dniUser = new JTextField();
		sheetCentralIncomeData.add(dniUser);
		
		JLabel msjePass = new JLabel("Password");
		sheetCentralIncomeData.add(msjePass);
		inPass = new JPasswordField();
		sheetCentralIncomeData.add(inPass);
		
		
		JPanel bottomSheet = new JPanel();
		bottomSheet.setLayout(new FlowLayout());
		login = new JButton("Iniciar Sesión"); 
		bottomSheet.add(login);
		 
		add(sheetUpper, BorderLayout.NORTH);
		add(centralSheet, BorderLayout.CENTER);
		add(bottomSheet, BorderLayout.SOUTH);
		
		ControlLogin buttonControl = new ControlLogin(this);
		
		login.addActionListener(buttonControl); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public String getDniUser()
	{
		 return dniUser.getText();
	}
	
	public String  getInPass(){
		
		char[] arrayC = inPass.getPassword();
		String pass = new String(arrayC);
		return pass;
	}
	
	public JButton  getLogin(){
		return login;
	}
	
}
