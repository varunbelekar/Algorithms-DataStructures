package com.varun.datastructures.stack;

public class SynchronizedStackUsingArray<T> implements CustomStack<T> {
    private Object[] arr;
    private int top;
    private int capacity;

    public SynchronizedStackUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
        top = 0;
    }

    @Override
    public synchronized void push(T i) {
        if (top >= capacity) return;

        try {
            System.out.println("Adding element");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        arr[top++] = i;
    }

    @Override
    public synchronized T pop() {
        if (top <= 0) return null;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return (T) arr[--top];
    }

    @Override
    public synchronized T peek() {
        if (top == 0) return null;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return (T) arr[top];
    }

    @Override
    public synchronized boolean isEmpty() {
        return top == 0;
    }
}
