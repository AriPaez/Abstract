package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Login;
import view.MedicalPanel;
import view.SearchPatient;

 
public class ControlMedicalPanel implements ActionListener {

	private MedicalPanel medicalPanel;
	
	
	public ControlMedicalPanel(MedicalPanel medicalPanel) {
		this.medicalPanel = medicalPanel;
	 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object buttonChosen = e.getSource();
		
		
		if (buttonChosen==medicalPanel.getPatientForm()) {
			
			medicalPanel.dispose();
			SearchPatient searchPatient=new SearchPatient();
			
			
		}
		else if(buttonChosen==medicalPanel.getShiftPatients())
		{
			System.out.println("getShiftPatients");
		}
		else
		{
			System.out.println("getGoBack");
		}
		  

	}

	
	
}
