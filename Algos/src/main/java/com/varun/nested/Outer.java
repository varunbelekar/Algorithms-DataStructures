package com.varun.nested;

public class Outer {
    static String staticOuterField = "Static outer field";
    int x = 5;
    String outerField = "Outer field";

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        outer.outerMethod();
        inner.innerMethod();

        Outer.StaticInnerClass staticInnerClass = new Outer.StaticInnerClass();

        System.out.println();

        staticInnerClass.staticInnerMethod();
    }

    void outerMethod() {
        System.out.println("Inside outer method");
    }

    static class StaticInnerClass {
        void staticInnerMethod() {
            //System.out.println("Inside inner method: " + x);//Cannot refer outer class variables & methods
            //System.out.println(outerField); Compile error
            System.out.println(staticOuterField);
        }
    }

    class Inner {
        void innerMethod() {
            System.out.println("Inside inner method: " + x);
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }
}
