package com.training.domains;
import java.util.*;

public class Appointment {

	private Map<Doctor,List<Patient>> appointments;

	public Appointment() {
		super();
		
		this.appointments = new HashMap<>();
		
	}
	
	public boolean addAppointment(Doctor doctor,Patient patient) {
		
		boolean result = false;
		 if(this.appointments.containsKey(doctor)) {
			 
			List<Patient> patientList =   this.appointments.get(doctor);
			 patientList.add(patient);
			 
			 result = true;

			 
		 } else {
			 
			 List<Patient> patientList = new ArrayList<>();
			    patientList.add(patient);
			 this.appointments.put(doctor, patientList);
			 
			 result = true;
		 }
		
		return result;
	}
	
	
	public List<Patient> getAppointments(Doctor doc){
		
		return this.appointments.get(doc);
	}
}
