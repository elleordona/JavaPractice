package com.digitalfutures.javapractice.strings;

public class VerticalWord {
    public static String vertical(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return "0";
        }

        boolean isWord = false;
        int endOfLine = sentence.length();

        for (int i = 0; i < sentence.length(); i++) {
            boolean check = sentence.substring(i, i+1).equals(" ");
            if (!check && i != endOfLine) {
                isWord = true;
            } else if (check && isWord) {

            }
        }
        return sentence;
    }
}
