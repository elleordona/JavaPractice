package com.digitalfutures.javapractice.strings;

public class Strings {

    // Exercise 1
    static String s1 = "yesterday it was raining";
    static String s2 = "today it is sunny";

    // Exercise 2


    public static void main(String[] args) {
        // Exercise 1
        System.out.println(s2.toUpperCase() + ", "+s1.toUpperCase());
        System.out.println((s2.substring(0,12) + s1.substring(17)).toUpperCase());
    }
}
