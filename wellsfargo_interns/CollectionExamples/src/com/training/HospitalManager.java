package com.training;

import java.util.*;

import com.training.domains.Hospital;
import com.training.utils.NameComparator;
import com.training.utils.PhoneComparator;

public class HospitalManager {

	private ArrayList<Hospital> hospitalList;

	public HospitalManager() {
		super();
	
		this.hospitalList = new ArrayList<>();
		
	}
	
	public boolean addHospital(Hospital hospRef){
		
	    
		     return this.hospitalList.add(hospRef);
		     
		     
	}
	
	public Hospital remove(Hospital hospRef) {
		
		int idxPos = this.hospitalList.indexOf(hospRef);
		
		 if(idxPos < 0) {
			 throw new RuntimeException("Element Does not Exist");
			 } else {
		   return this.hospitalList.remove(idxPos);
		 }
	}
	
	public void printHospitalList() {
		
		 // Collections.sort(this.hospitalList);
		
	 //	Collections.sort(this.hospitalList,new NameComparator());
		
		
		Collections.sort(this.hospitalList,new PhoneComparator());
		
		for(Hospital eachHospital : hospitalList) {
			
			System.out.println(eachHospital);
		}
	}
	
	
	public List<Hospital> getHospitalList(){
		
		return this.hospitalList;
	}
	
}
