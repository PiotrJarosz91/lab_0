package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

	public List<String> tails(String value) {
		List<String> tails = new ArrayList<>(value.length());
		for (int a = 0; a <= value.length(); a++) {
			tails.add(value.substring(a));
		}
		return tails;
	}
}
