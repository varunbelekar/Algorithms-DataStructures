package com.varun.designpatterns.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Observer observer1 = new FootballObserver();
        Observer observer2 = new CricketObserver();


        Subject subject = new Subject();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.notifyObservers();
    }
}
