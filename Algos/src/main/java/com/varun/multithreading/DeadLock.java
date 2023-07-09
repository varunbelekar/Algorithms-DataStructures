package com.varun.multithreading;

public class DeadLock {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println(Thread.currentThread());
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println(Thread.currentThread());
                }
            }
        });
        t1.start();
        t2.start();
    }
}
