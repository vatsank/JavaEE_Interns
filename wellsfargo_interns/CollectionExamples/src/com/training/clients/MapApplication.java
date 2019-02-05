package com.training.clients;
import java.util.*;

import com.training.domains.Patient;
public class MapApplication {

	public static void main(String[] args) {
	
		
		HashMap<Integer,Patient> patientList = new HashMap<>();
		
		
		patientList.put(101, new Patient(303,"Ramesh",true));
		patientList.put(102, new Patient(405,"Magesh",false));
		patientList.put(103, new Patient(363,"Siva",false));
		
		
		System.out.println(patientList.get(102));
		
		
		
	}

}
