package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Login;
 
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
		System.out.println("User:"+login.getDniUser());
		System.out.println("Pass:"+login.getInPass());

	}

	
	
}
