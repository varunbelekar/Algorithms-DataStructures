package com.varun.datastructures.stack;

public interface CustomStack<T> {
    void push(T i);

    T pop();

    T peek();

    boolean isEmpty();
}
