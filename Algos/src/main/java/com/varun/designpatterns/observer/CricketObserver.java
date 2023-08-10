package com.varun.designpatterns.observer;

public class CricketObserver implements Observer {
    @Override
    public void notifyObserver() {
        System.out.println("Cricket observer notified");
    }
}
