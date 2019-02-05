package com.training.client;

import java.util.List;

import com.training.domains.Appointment;
import com.training.domains.Doctor;
import com.training.domains.Patient;

public class AppointmentApplication {

	
	public static void printAppointment(List<Patient> patList) {
		
		
		for(Patient eachPatient: patList) {
			
			System.out.println(eachPatient.getId() + "," +eachPatient.getPatientName());
			
		}
		   
		   
	}
	public static void main(String[] args) {
	
       Doctor kamal = new Doctor(101,"Yashi","ENT");
		
		Doctor munna = new Doctor(102,"Anand","Dentist");
		
		Patient ram =  new Patient(303,"Ramesh",true);
		Patient mag = new Patient(405,"Magesh",false);
		Patient siv =  new Patient(363,"Siva",false);
		Patient reddy =  new Patient(863,"Rama",false);
		
		Appointment app = new Appointment();
		
		   app.addAppointment(munna, reddy);
		   app.addAppointment(munna, ram);
		   
		   
		   app.addAppointment(kamal, siv);
		    app.addAppointment(kamal, mag);
		   
		   
		   
		    System.out.println("Doctor :" +munna.getDoctorName() + "  Appointments List");
		    
		    printAppointment(app.getAppointments(munna));
		    
		    
		    System.out.println("Doctor :"+kamal.getDoctorName() + "  Appointments List");
		    
		    printAppointment(app.getAppointments(kamal));

		    
		    
		   

	}

}
