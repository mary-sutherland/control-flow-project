package com.tts;

import java.util.Scanner;

public class AsciiChars {
    public static void main(String[] args) {
        printNumbers();
        printLowerCase();
        printUpperCase();

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

    }

    public static void printNumbers() {
        // TODO: print valid numeric input
        for (int i = (int) '0'; i <= (int) '9'; i++) {
            System.out.println(i);
        }


    }

    public static void printLowerCase() {
        // TODO: print valid lowercase alphabetic input
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
    }

    public static void printUpperCase() {
        // TODO: print valid uppercase alphabetic input
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
    }
}