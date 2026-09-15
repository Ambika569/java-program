package com.tech.operators.oops;

public class poly {

    public void add(int a, int b){
        System.out.println("Addition of two numbers is: " + (a+b));

    }
    public void add(String a, String b){
        System.out.println("Concatenation of two strings is: " + (a+b));
    }

    public static void main(String[] args) {
        poly i = new poly();
        i.add(10, 20);
        i.add("Hello", "World");
    }
}
