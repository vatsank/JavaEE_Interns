package com.training.demo;

public class UsePrintString implements Runnable {

	private String str1;
	private String str2;
	
	
	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		Thread thread =  new Thread(this);
		thread.start();
	}


	@Override
	public void run() {

		 PrintString.printStrings(str1, str2);
	}

}
