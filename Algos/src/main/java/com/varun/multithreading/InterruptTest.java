package com.varun.multithreading;

public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++) {
                System.out.println(i);
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread interrupted");
                    throw new RuntimeException(new InterruptedException());
                }
            }
        });

        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        System.out.println("rest of the program");
    }
}
