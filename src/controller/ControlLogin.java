package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.Login;
import view.MedicalPanel;
 
public class ControlLogin implements ActionListener {

	private Login login;
	private String dniUser;
	
	public ControlLogin(Login login) {
		this.login = login;
	 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object buttonChosen = e.getSource();
		
		//search the database for user to login
		if(login.getDniUser().equals("apaez") && login.getInPass().equals("123")) {
			
			MedicalPanel medicalPanel=new MedicalPanel();
			login.dispose();
			
			
		}
		else
		{
			System.out.println("Error, not open windows MedicalPanel ");
		}
		
		
		  

	}

	
	
}
