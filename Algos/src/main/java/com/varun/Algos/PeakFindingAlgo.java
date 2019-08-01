package com.varun.Algos;

import java.util.ArrayList;
import java.util.List;

public class PeakFindingAlgo {
	static int pos = 0;
	static int mid = 0;
	public static List<Integer> findPeakNaive(int[] a){
		List<Integer> peaks = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(i == 0 ){
				if(a[i] > a[i+1]){
					peaks.add(a[i]);
				}
			}
			else if(i == a.length-1){
				if(a[i] > a[i-1]){
					peaks.add(a[i]);
				}
			}
			else{
				if(a[i] > a[i+1] && a[i] > a[i-1]){
					peaks.add(a[i]);
				}
			}
		}
		return peaks;
	}
	
	//10 , 9 , 8 , 7 , 6 , 5 , 4
	public static int binarySearch(int[] a, int start, int end) {
		//System.out.println(start + " " + end);
		if(start > end){
			return -1;
		}
		mid = (start + end) / 2;
		//System.out.println(a[mid]);
		if(mid == 0){
			if(a[mid] > a[mid+1]){
				return a[mid];
			}
		}
		if(mid == a.length - 1){
			if(a[mid] > a[mid-1]){
				return a[mid];
			}
		}
		if(a[mid] > a[mid + 1] && a[mid] > a[mid - 1] ){
			return a[mid];
		}
		if(a[mid] < a[mid-1]){
			pos = binarySearch(a, start, mid - 1);
		}
		else{
			pos = binarySearch(a, mid + 1, end);
		}
		return pos;
	}
	
	public static int findPeakBinary(int[] b){
		int peak = binarySearch(b, 0, b.length - 1);
		return peak;
	}
	
	public static void main(String[] args) {
		int[] a = {10 , 20 , 15 , 20 , 23 , 90 , 67};
		int[] b = {10 , 20 , 15 , 2 , 23 , 90 , 67};
		List<Integer> peaks = findPeakNaive(a);
		System.out.println("Naive peak finding " + peaks);
		int result = findPeakBinary(a);
		System.out.println("Peak finding Binary: " + result);
		
	}
}
