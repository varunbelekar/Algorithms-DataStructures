package com.varun.multithreading;

public class PrintNumbers {
    private static Object lock = new Object();

    private static boolean thread1Turn = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            printNumbers(1, true);
        });
        Thread t2 = new Thread(() -> {
            printNumbers(2, false);
        });
        t1.start();
        t2.start();
    }

    public static void printNumbers(int threadNumber, boolean turn) {
        for (int i = 1; i <= 100; i++) {
            synchronized (lock) {
                while (turn != thread1Turn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(String.format("From thread %s %s",
                        threadNumber, i));
                thread1Turn = !thread1Turn;
                lock.notifyAll();
            }
        }
    }
}
