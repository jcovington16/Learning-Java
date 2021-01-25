package com.jcyber2000;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // byte stores 1 bytes of data range [-128,127]
        byte age = 30;

        // short stores 2 bytes of data range [-32K,32K]
        short line = 15000;

        // int stores 4 bytes of data range [-2B,2B]
        int cost = 2_000_000_000;

        // long stores 8 bytes of data
        long viewsCount = 3_123_456_789L; // use underscores to help read the value better.

        // float stores 4 bytes of data
        float price = 10.99F; // must use F to show that its a float and not double.

        // double stores 8 bytes of data
        double pairs = 15.99;

        // char stores 2 bytes of data [A,B,C...]
        char letter = 'A';

        // boolean stores 1 byte of data true/false
        boolean isEligible = true; // or false;

    }
}
