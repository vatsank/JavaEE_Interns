package com.training.clients;

import java.util.*;

import com.training.domains.Doctor;

public class SetApplication {

	public static void main(String[] args) {
	
		
		Set<Doctor> doctors = new TreeSet<>();
		
		Doctor kamal = new Doctor(101,"Yashi","ENT");
		
		Doctor munna = new Doctor(102,"Anand","Dentist");
		
		Doctor kanna = new Doctor(103,"Chandan","Dentist");

		 doctors.add(kanna);
		 doctors.add(munna);
		 doctors.add(kamal);
	
		 System.out.println(doctors);
		 
		
	

	}

}
