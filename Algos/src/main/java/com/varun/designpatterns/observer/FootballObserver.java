package com.varun.designpatterns.observer;

public class FootballObserver implements Observer {
    @Override
    public void notifyObserver() {
        System.out.println("football observer notified");
    }
}
