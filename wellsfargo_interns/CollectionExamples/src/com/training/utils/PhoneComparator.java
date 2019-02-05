package com.training.utils;

import java.util.Comparator;

import com.training.domains.Hospital;

public class PhoneComparator implements Comparator<Hospital> {

	@Override
	public int compare(Hospital o1, Hospital o2) {
		
		if(o1.getPhoneNumber() > o2.getPhoneNumber()) return -1;
		if(o1.getPhoneNumber() < o2.getPhoneNumber()) return 1;
		
		return 0;
	}

}
