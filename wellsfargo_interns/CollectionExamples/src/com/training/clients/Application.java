package com.training.clients;

import java.util.ArrayList;
import java.util.Collections;

import com.training.HospitalManager;
import com.training.domains.Hospital;

public class Application {

	public static void main(String[] args) {
	
		
		HospitalManager mgr = new HospitalManager();
		

		Hospital care = new Hospital(101,"Care Hospital","GachiBowli",894848);
		
		boolean resp = mgr.addHospital(care);

		if(!resp) {
			System.out.println("Hospital Not Added");
			
		} else {
			System.out.println("Hospital Added");
		}
		
		
		Hospital aig = new Hospital(102,"AIG Hospital","Kondapur",794848);
		
		mgr.addHospital(aig);
		
		
		mgr.printHospitalList();
		
		
		// Hospital resp2 = mgr.remove(aig);
		
		 System.out.println("After Removal");
		 
		 
		// System.out.println(resp2 + "Is Removed");
		 
		 mgr.printHospitalList();
		
		 ArrayList<String> nameList = new ArrayList<>();
		 
		 nameList.add("Ramesh");
		 nameList.add("Anand");
		 nameList.add("Priyam");
		 nameList.add("Zahir");
		 
		 Collections.sort(nameList);
		 
		 System.out.println(nameList);
		 
		 
		 
	}

}
