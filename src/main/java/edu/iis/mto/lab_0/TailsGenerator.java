package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		int length = value.length();
		List<String> tails = new ArrayList<>(length+1);
		
		for(int i = 0; i<=length; i++){
			tails.add(value.substring(0, length-i));
		}
			
		return tails;
	}

}
