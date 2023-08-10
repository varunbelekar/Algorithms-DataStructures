package com.varun.designpatterns.strategy;

public class Sorter {
    private final SortingAlgorithm sortingAlgorithm;

    public Sorter(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort(int[] arr) {
        sortingAlgorithm.sort(arr);
    }
}
