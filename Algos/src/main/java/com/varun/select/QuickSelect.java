package com.varun.select;

public class QuickSelect {
    public void quickSelect(int[] nums, int target){
        quickSelect(nums, 0, nums.length - 1, target);
    }

    /**
     *
     * @param nums - Array to be quick-selected
     * @param start - Start Index of the array
     * @param end - End Index of the array
     * @param target - index of the target element.
     */
    private void quickSelect(int[] nums, int start, int end, int target){
        while(start < end){
            int pIndex = partition(start, end, nums);
            if(pIndex == target){
                return;
            }
            if(pIndex > target)
                end = pIndex - 1;
            if(pIndex < target)
                start = pIndex + 1;
        }
    }

    private int partition(int start, int end, int[] nums){
        int pivot = nums[end];
        int pIndex = start;

        for(int i = start; i < end; i++){
            if(nums[i] <= pivot){
                swap(nums, i, pIndex);
                pIndex += 1;
            }
        }
        swap(nums, pIndex, end);
        return pIndex;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
