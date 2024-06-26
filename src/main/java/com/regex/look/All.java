package com.regex.look;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class All {
    public static void main(String[] args) {
        // Positive Lookahead Example
        String pattern1 = "\\d+(?= USD)";
        String text1 = "Price: 5 USD, 10 EUR, 20 USD";
        matchPattern(pattern1, text1);

        // Negative Lookahead Example
        String pattern2 = "\\d+(?! USD)";
        String text2 = "Price: 5 USD, 10 EUR, 20 USD";
        matchPattern(pattern2, text2);

        // Positive Lookbehind Example
        String pattern3 = "(?<=USD )\\d+";
        String text3 = "Price: USD 5, EUR 10, USD 20";
        matchPattern(pattern3, text3);

        // Negative Lookbehind Example
        String pattern4 = "(?<!USD )\\d+";
        String text4 = "Price: USD 5, EUR 10, USD 20";
        matchPattern(pattern4, text4);
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
