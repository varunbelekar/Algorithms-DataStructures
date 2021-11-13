package com.varun.sorting;

public class QuickSort {
    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    public static void quickSort(int[] nums, int start, int end){
        if(start < end){
            int partitionIndex = partition(nums, start, end);
            quickSort(nums, start, partitionIndex -1);
            quickSort(nums, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if (nums[i] <= pivot){
                swap(nums, partitionIndex, i);
                partitionIndex++;
            }
        }
        swap(nums, partitionIndex, end);
        return partitionIndex;
    }

    private static void swap(int[] nums, int partitionIndex, int i) {
        int temp = nums[partitionIndex];
        nums[partitionIndex] = nums[i];
        nums[i] = temp;
    }
}
