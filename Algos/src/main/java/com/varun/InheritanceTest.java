package com.varun;

import com.varun.inheritance.Base;
import com.varun.inheritance.Derived;

public class InheritanceTest {
    public static void main(String[] args) {
        Base obj1 = new Derived();

        obj1.display();

        //obj1.print(); Compile Error, since reference variable of parent class does not have access to method of child class
    }
}
