package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {
	
	 public static void main(String[] args) {
	        // Example 1: Matching a date in the format YYYY-MM-DD
	        String dateText = "Today is 2024-06-18, yesterday was 2024-06-17.";
	        System.out.println("Pattern: \\d{4}-\\d{2}-\\d{2}");
	        matchPattern("\\d{4}-\\d{2}-\\d{2}", dateText);

	        // Example 2: Matching a phone number in the format (XXX) XXX-XXXX
	        String phoneText = "Call me at (123) 456-7890 or (987) 654-3210.";
	        System.out.println("\nPattern: \\(\\d{3}\\) \\d{3}-\\d{4}");
	        matchPattern("\\(\\d{3}\\) \\d{3}-\\d{4}", phoneText);

	        // Example 3: Matching a word that can be singular or plural
	        String wordText = "cat cats dog dogs";
	        System.out.println("\nPattern: \\b\\w+s?\\b");
	        matchPattern("\\b\\w+s?\\b", wordText);

	        // Example 4: Matching a URL starting with http or https
	        String urlText = "Visit our site at http://example.com or https://secure.example.com.";
	        System.out.println("\nPattern: https?://\\S+");
	        matchPattern("https?://\\S+", urlText);

	        // Example 5: Matching repeated patterns (e.g., "ha" in "hahaha")
	        String laughText = "He said haha and then hahahaha.";
	        System.out.println("\nPattern: (ha)+");
	        matchPattern("(ha)+", laughText);
	    }

	    public static void matchPattern(String regex, String text) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);
	        while (matcher.find()) {
	            System.out.println("Matched: \"" + matcher.group() + "\" at position " + matcher.start());
	        }
	    }
	}
