package com.varun.datastructures.stack;

import com.varun.datastructures.linkedlist.ListNode;

public class StackUsingLinkedList<T> implements CustomStack<T>{
    private ListNode<T> top = null;

    @Override
    public void push(T val) {
        if (top == null){
            top = new ListNode<>(val);
        }else {
            ListNode<T> temp = new ListNode<>(val);
            temp.setNext(top);
            top = temp;
        }
    }

    @Override
    public T pop() {
        T val = top.getVal();
        top = top.getNext();
        return val;
    }

    @Override
    public T peek() {
        return top.getVal();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
