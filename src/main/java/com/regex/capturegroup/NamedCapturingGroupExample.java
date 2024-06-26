package com.regex.capturegroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamedCapturingGroupExample {
	
	public static void main(String[] args) {
//		String date = "2024-06-26";
//		String regex = "(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})";

		 String date1 = "2024-06 26";
	     String date2 = "2024-06";
	     String regex = "(?:(^RBD))(?<year>\\d{4})-(?<month>\\d{2})(?: (?<day>\\d{2}))";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(date1);

		if (matcher.matches()) {
			String year = matcher.group("year");
			String month = matcher.group("month");
			String day = matcher.group("day");
			System.out.println("Year: " + year);
			System.out.println("Month: " + month);
			System.out.println("Day: " + day);
		} else {
			System.out.println("Date does not match the pattern.");
		}
	}
}
