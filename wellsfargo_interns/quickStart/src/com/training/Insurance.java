package com.training;

public class Insurance {

	private long policyNumber;
	private String policyHolderName;
	
	
	public Insurance(long policyNumber, String policyHolderName) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	}


	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}


	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}


	public double calculatePremium() {
		
		return 100.00;
	}


	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + "]";
	}
	
	
}
