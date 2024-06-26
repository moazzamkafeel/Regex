package com.regex.look;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookbehind {
	
	  public static void main(String[] args) {
	        String patternStr = "(?<=USD )\\d";
	        String text = "Price: USD 5, EUR 10, USD 20";
	        
	        matchPattern(patternStr, text);
	    }

	    private static void matchPattern(String patternStr, String text) {
	        Pattern pattern = Pattern.compile(patternStr);
	        Matcher matcher = pattern.matcher(text);

	        System.out.println("Pattern: " + patternStr);
	        System.out.println("Text: " + text);

	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group() + " at position " + matcher.start());
	        }
	        System.out.println();
	    }
}
