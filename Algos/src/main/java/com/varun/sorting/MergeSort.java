package com.varun.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    private static void merge(int[] arr, int left, int right, int middle){
        List<Integer> temp = new ArrayList<>();
        int i = left, j = middle + 1, k = left;
        while (i <= middle && j <= right){
            if (arr[i] <= arr[j]){
                temp.add(arr[i++]);
            }else {
                temp.add(arr[j++]);
            }
        }
        while (i <= middle){
            temp.add(arr[i++]);
        }
        while (j <= right){
            temp.add(arr[j++]);
        }

        for (int num :temp) {
            arr[k++] = num;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
