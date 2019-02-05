package com.training.utils;
import java.util.Comparator;

import com.training.domains.*;

public class NameComparator implements Comparator<Hospital> {

	@Override
	public int compare(Hospital o1, Hospital o2) {
		// TODO Auto-generated method stub
		return o2.getHospitalName().compareTo(o1.getHospitalName());
	}

	
}
