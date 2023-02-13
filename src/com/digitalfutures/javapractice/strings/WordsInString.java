package com.digitalfutures.javapractice.strings;

public class WordsInString {

    // Method 1
    public static int count(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return 0;
        }

        int wordCount = 0;

        boolean isWord = false;
        int endOfLine = sentence.length() - 1;

        for (int i = 0; i < sentence.length(); i++) {
            boolean check = sentence.substring(i, i+1).equals(" ");
            if (!check && i != endOfLine) {
                isWord = true;
            } else if (check && isWord) {
                wordCount++;
                isWord = false;
            } else if (!check) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(count(""));
        System.out.println(count(null));
        System.out.println(count("One"));
        System.out.println(count("O"));
        System.out.println(count("Java and C++"));
        System.out.println(count("a b c"));
        System.out.println(count("YouAre,TheBest"));
        System.out.println(count("slay queen"));
    }
}
