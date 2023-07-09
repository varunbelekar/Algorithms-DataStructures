package com.varun.multithreading;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue(1);
        //blockingQueue.add(5);

        Thread t1 = new Thread(() -> blockingQueue.add(2), "Thread1");
        Thread t2 = new Thread(() -> blockingQueue.add(2), "Thread2");
        Thread t3 = new Thread(() -> blockingQueue.remove(), "Thread3");

        //t3.start();
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println(blockingQueue.getQ());
    }
}
