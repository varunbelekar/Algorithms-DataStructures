package com.varun.designpatterns.strategy;

public class SortingTest {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sort(new int[]{1, 2});
    }
}
