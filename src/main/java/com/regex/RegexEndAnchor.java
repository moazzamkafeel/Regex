package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEndAnchor {
    public static void main(String[] args) {
        String text = "AVAIL AVAIL123 AVAIL NOW PRE-AVAIL";

        // Pattern with ^AVAIL$
        System.out.println("Pattern: ^AVAIL$");
        matchPattern("^AVAIL$", text);

        // Pattern with ^AVAIL
        System.out.println("\nPattern: ^AVAIL");
        matchPattern("^AVAIL", text);
    }

    public static void matchPattern(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Matched: \"" + matcher.group() + "\" at position " + matcher.start());
        }
    }
}
