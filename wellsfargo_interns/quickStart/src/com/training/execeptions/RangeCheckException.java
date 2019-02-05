package com.training.execeptions;

public class RangeCheckException extends Exception {

	private String value;

	public RangeCheckException(String value) {
		super();
		this.value = value;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.value + "Is not in the range ";
	}
	
	
}
