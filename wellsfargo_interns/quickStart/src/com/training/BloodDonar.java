package com.training;

import com.training.execeptions.RangeCheckException;

public class BloodDonar {

	private String donarName;
	private String bloodGroup;
	private long mobileNumber;
	private Address address;
	
	public BloodDonar() {
		super();
	}
	// Exception Handling - Declare Rule
	public BloodDonar(String donarName, String bloodGroup, long mobileNumber, Address address) throws RangeCheckException {
		super();
		this.donarName = donarName;
		this.bloodGroup = bloodGroup;
		
		if(mobileNumber >10000000000L || mobileNumber < 999999999L) {
			
			throw new RangeCheckException(new Long(mobileNumber).toString());
		} else {
		        this.mobileNumber = mobileNumber;
		}
		this.address = address;
	}
	public String getDonarName() {
		return donarName;
	}
	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	// Exception Handling- Handle Rule
	
	public void setMobileNumber(long mobileNumber) {
		
		if(mobileNumber >=10000000000L || mobileNumber < 999999999L) {
			
			try {
				
				throw  new RangeCheckException(new Long(mobileNumber).toString());
				
			} catch (RangeCheckException e) {
				
				System.err.println(e.getMessage());
			}
		} else {
		this.mobileNumber = mobileNumber;
		}
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
	
		return  this.bloodGroup + ":"+ this.donarName + ":"+ this.mobileNumber+":"+this.address;
		
	}
	
	
}
