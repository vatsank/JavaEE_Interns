package com.training;

public class VechileInsurance extends Insurance {

	private String vechModel;
	private long yearOfMfg;
	
	
	public VechileInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VechileInsurance(long policyNumber, String policyHolderName, String vechModel, long yearOfMfg) {
		super(policyNumber, policyHolderName);
		this.vechModel = vechModel;
		this.yearOfMfg = yearOfMfg;
	}
	public String getVechModel() {
		return vechModel;
	}
	public void setVechModel(String vechModel) {
		this.vechModel = vechModel;
	}
	public long getYearOfMfg() {
		return yearOfMfg;
	}
	public void setYearOfMfg(long yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}
	@Override
	public String toString() {
		return "VechileInsurance [vechModel=" + vechModel + ", yearOfMfg=" + yearOfMfg + "]";
	}
	@Override
	public double calculatePremium() {
		
		double premium = 0.10;
		if(this.vechModel.equals("car")) {
			
			 if(this.yearOfMfg > 2000) {
				 
				 premium = 0.12;
			 } else {
				 
				 premium = 0.15;
			 }
		}
		
		if(this.vechModel.equals("bike")) {
			
			
			if(this.yearOfMfg > 2000) {
				 
				 premium = 0.8;
			 } else {
				 
				 premium = 0.10;
			 }
		}
		
		return premium;
	}
	
	
	
}
