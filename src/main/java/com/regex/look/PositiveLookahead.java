package com.regex.look;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookahead {
	
	 public static void main(String[] args) {
	        String patternStr = "\\d(?= USD)";
	        String text = "Price: 5 USD, 10 EUR, 20 USD";
	        
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
