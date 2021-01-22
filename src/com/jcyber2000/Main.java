package com.jcyber2000;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr = {10, 20, 30, 40};
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        System.out.println(numbers.indexOf(10));
        numbers.maxItem();
        numbers.reverse(arr);
        numbers.print();
    }
}
