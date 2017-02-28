package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		List<String> tails = new ArrayList<>(value.length());
		for(int i=0; i<5; i++) {
		    tails.add(value);
		}
		tails.add("");
		System.out.println(tails.size()-1);
		return tails;
	} 

}
;