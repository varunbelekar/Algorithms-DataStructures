package com.varun.datastructures.stack;

public class StackTest {
    public static void main(String[] args) {
        CustomStack<Integer> stack = new SynchronizedStackUsingArray<>(3);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                stack.push(1);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                stack.push(2);
            }
        });
        t1.start();
        t2.start();
    }
}
