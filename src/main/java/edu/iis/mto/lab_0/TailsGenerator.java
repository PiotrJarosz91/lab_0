package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		List<String> tails = new ArrayList<>(value.length()+1);
		for(int i = value.length(); i >= 0; i--) {
			tails.add(value.substring(0,i));
		}
		return tails;
	}

}
