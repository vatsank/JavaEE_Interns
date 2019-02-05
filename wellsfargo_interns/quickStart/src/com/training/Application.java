package com.training;

import com.training.execeptions.RangeCheckException;

public class Application {

	public static final void main(String[] gs) {
	

		Greeting javaGreet = new Greeting();
		
		System.out.println(javaGreet.getMessage());
		
		
		BloodDonar ramesh = new BloodDonar();
		
		ramesh.setDonarName("Ramesh");
		ramesh.setBloodGroup("bpos");
		ramesh.setMobileNumber(942432030L);
		
		Address rameshAddress = new Address("gandhi street", "nehru Nagar","indirapuri" ,48482828);
		
		ramesh.setAddress(rameshAddress);
		
		System.out.println(ramesh.getBloodGroup());
		
		BloodDonar suresh =null;
		try {
			suresh = new BloodDonar("suresh","opos",108,new Address("sector1","block2","sarojininagar",181848));
		
		} catch (RangeCheckException e) {
  			e.printStackTrace();
		}
		
		
      System.out.println(suresh.getBloodGroup());
      
      System.out.println(suresh);
		
	}

}
