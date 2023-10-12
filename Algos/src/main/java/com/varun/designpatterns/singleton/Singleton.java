package com.varun.designpatterns.singleton;

public class Singleton {
    private static volatile Singleton _INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (_INSTANCE == null) {
            synchronized (Singleton.class) {
                if (_INSTANCE == null) {
                    _INSTANCE = new Singleton();
                }
            }
        }
        return _INSTANCE;
    }
}

class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
