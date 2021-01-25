package com.jcyber2000;

public class Strings {
    public static void main() {
        // String message = new String is redundant
        // Strings are immutable
        // Short hand to initialize this variable
        String message = "Hello World" + "!!";

        System.out.println(message);

        // Returns true or false
        System.out.println(message.endsWith("!!")); // statsWith()

        // message.length() will return the number of characters
        // message.indexOf() see if a string contains letters or numbers
        // message.replace() target, replacement - what character do we want to replace.
        // message.toLowerCase() creates a new instance of the string in lowercase
    }
}
