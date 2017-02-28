package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		List<String> tails = new ArrayList<>(value.length()+1);
		for (int tailLength = value.length(); tailLength>=0; tailLength--) {
			tails.add(value.substring(0, tailLength));
		}
		return tails;
	}

}
