package ru.hse.java.application.regexmatcher;

import java.util.regex.Pattern;

public class Main {

    public static boolean matches(String text, String regex) {
        boolean matchingResult = false;
        try {
            matchingResult = Pattern.compile(regex).matcher(new SecureMatchingString(text)).matches();
        } catch (RuntimeException ex) {
            System.err.println(ex.getMessage());
        }
        return matchingResult;
    }

    public static void main(String[] args) {
    }
}
