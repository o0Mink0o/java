package com.plagahoa22.hgjj.helpers;

public class Calculator {
    public static String getDivisbleOutput(int numerator) {
        String output = "Denominater";
        for (int i = 2; i < numerator; i++) {
            if (numerator % i == 0) {
                output += i + ",";
            }
        }
        return output;
    }
}
