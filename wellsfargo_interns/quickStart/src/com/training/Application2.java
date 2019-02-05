package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Insurance insurance = new VechileInsurance(109,"Ramesh","bike",1998);
		
		 double preimum = insurance.calculatePremium();
		 
			
		 double amount = 45000 * preimum;
		 
		 System.out.println(amount);
		
	}

}
