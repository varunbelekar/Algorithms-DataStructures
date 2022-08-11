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
        int[] temp1 = new int[middle - left + 1];
        int[] temp2 = new int[right - middle];

        for (int i = 0, j = left; i < temp1.length; i++, j++) {
            temp1[i] = arr[j];
        }
        for (int i = 0, j = middle + 1; i < temp2.length; i++, j++) {
            temp2[i] = arr[j];
        }

        //Merge two sorted arrays
        int i = 0, j = 0, k = left;
        while (i < temp1.length && j < temp2.length){
            if (temp1[i] <= temp2[j]){
                arr[k++] = temp1[i++];
            }else{
                arr[k++] = temp2[j++];
            }
        }

        while (i < temp1.length){
            arr[k++] = temp1[i++];
        }
        while (j < temp2.length){
            arr[k++] = temp2[j++];
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
