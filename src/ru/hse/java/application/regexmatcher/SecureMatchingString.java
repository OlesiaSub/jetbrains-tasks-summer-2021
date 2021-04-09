package ru.hse.java.application.regexmatcher;

import javax.swing.Timer;

public class SecureMatchingString implements CharSequence {

    private final String string;
    private static Timer timer;

    public SecureMatchingString(String string) {
        this.string = string;
        int delay = 2000;
        timer = new Timer(delay, e -> timer.stop());
        timer.start();
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        if (!timer.isRunning()) {
            throw new RuntimeException("Time limit was exceeded.");
        }
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start, end);
    }
}
