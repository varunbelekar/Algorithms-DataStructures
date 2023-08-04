package com.varun.inheritance;

public class Base {
    Base(int a, int b) {
        System.out.println("addition =" + (a + b));
    }

    public Base() {
        System.out.println("Base class constructor called");
    }

    public static void display() {
        System.out.println("display from Base");
    }
}
