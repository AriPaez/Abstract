package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControlMedicalPanel;

public class MedicalPanel  extends JFrame {
	
	private  JButton shiftPatients;
	private  JButton patientForm;
	private  JButton goBack;
	
	public MedicalPanel() {
		 
		 //Propiedades de la ventana principal.
		 setTitle("Sesión de Médico");
		 setSize(321,376);
		 setLocationRelativeTo(null);
		 setResizable(false);
		 getContentPane().setLayout(null);
		 
		 JLabel titleMain = new JLabel("Panel de Control");
		 titleMain.setFont(new Font("Arial", Font.BOLD, 20));
		 titleMain.setBounds(71, 11, 177, 38);
		 getContentPane().add(titleMain);
		 
		 patientForm = new JButton("");
		 patientForm.setIcon(new ImageIcon("here path"));
		 patientForm.setBounds(55, 87, 50, 50);
		 getContentPane().add(patientForm);
		 
		 JLabel msjePlanilaPaciente = new JLabel("Planilla Paciente");
		 msjePlanilaPaciente.setFont(new Font("Arial", Font.BOLD, 12));
		 msjePlanilaPaciente.setBounds(38, 148, 94, 14);
		 getContentPane().add(msjePlanilaPaciente);
		 
		 shiftPatients = new JButton();
		 shiftPatients.setIcon(new ImageIcon("here path"));
		 shiftPatients.setBounds(198, 87, 50, 50);
		 getContentPane().add(shiftPatients);
		 
		 JLabel msgShiftPatients = new JLabel("Turno del día");
		 msgShiftPatients.setFont(new Font("Arial", Font.BOLD, 12));
		 msgShiftPatients.setBounds(171, 148, 110, 14);
		 getContentPane().add(msgShiftPatients);
		 
		 goBack = new JButton();
		 goBack.setIcon(new ImageIcon("here path"));
		 goBack.setBounds(125, 238, 50, 50);
		 getContentPane().add(goBack);
		 
		 JLabel msgExit = new JLabel("Volver");
		 msgExit.setFont(new Font("Arial", Font.BOLD, 12));
		 msgExit.setBounds(135, 293, 26, 14);
		 getContentPane().add(msgExit);
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
			
		 
		 ControlMedicalPanel cVP=new ControlMedicalPanel(this);
		 
		 shiftPatients.addActionListener(cVP);
		 patientForm.addActionListener(cVP);
		 goBack.addActionListener(cVP);
	}
	
	public  JButton getShiftPatients() {
		return shiftPatients;
	}
	
	public JButton getPatientForm() {
		return patientForm;
	}
	
	public  JButton getGoBack() {
		return goBack;
	}
	
	

}
