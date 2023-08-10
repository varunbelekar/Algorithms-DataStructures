package com.varun.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    Set<Observer> observers = new HashSet<>();

    void registerObserver(Observer observer) {
        observers.add(observer);
    }

    void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.notifyObserver();
        }
    }
}
