package com.varun.datastructures.linkedlist;

public class ListNode<T> {
    private T val;
    private ListNode next;

    public ListNode(){

    }

    public ListNode(T val) {
        this.val = val;
        this.next = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
