package com.varun.inheritance;

public class Derived extends Base {
    public Derived() {
        super(2, 3);
        System.out.println("Derived class constructor");
    }

    public static void display() {
        System.out.println("display from Derived");
    }

    public void print() {
        System.out.println("print from Derived");
    }

}
