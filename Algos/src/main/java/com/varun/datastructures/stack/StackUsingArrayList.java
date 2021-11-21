package com.varun.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList<T> implements CustomStack<T>{
    private List<T> list;

    public StackUsingArrayList(){
        list = new ArrayList<T>();
    }

    @Override
    public void push(T i) {
        list.add(i);
    }

    @Override
    public T pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
