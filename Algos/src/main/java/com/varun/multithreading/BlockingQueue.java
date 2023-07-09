package com.varun.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int capacity) {
        q = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean add(int num) {
        System.out.println("Running thread : " + Thread.currentThread().getName());
        synchronized (q) {
            while (q.size() == capacity) {
                try {
                    System.out.println("Waiting thread : " + Thread.currentThread().getName());
                    q.wait(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            q.add(num);
            q.notifyAll();
            System.out.println("Completed thread : " + Thread.currentThread().getName());
            return true;
        }
    }

    public int remove() {
        System.out.println("Running thread : " + Thread.currentThread().getName());
        synchronized (q) {
            while (q.size() == 0) {
                try {
                    System.out.println("Waiting thread : " + Thread.currentThread().getName());
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int element = q.poll();
            q.notifyAll();
            System.out.println("Completed thread : " + Thread.currentThread().getName());
            return element;
        }
    }

    public Queue<Integer> getQ() {
        return q;
    }
}
