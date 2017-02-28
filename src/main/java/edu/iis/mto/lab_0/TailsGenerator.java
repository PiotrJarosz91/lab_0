package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		String tmp;
		List<String> tails = new ArrayList<>(value.length());	
		for(int i = 0; i <= value.length(); i++){
			tmp = value.substring(i);
			tails.add(tmp);
		}		
		return tails;
	}

}
