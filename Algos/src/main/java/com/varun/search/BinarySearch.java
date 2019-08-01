package com.varun.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] a, int start, int end, int x) {
		if(start > end){
			return 0;
		}
		if (a[(start + end) / 2] == x) {
			return (start + end) / 2;
		} 
		else if (x < a[(start + end) / 2]) {
			return binarySearch(a, start, (start + end) / 2 - 1, x);
		} 
		else {
			return binarySearch(a, (start + end) / 2 + 1, end, x);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			int index = binarySearch(a, 0, a.length-1, x);
			System.out.println(index);
		}
	}
}
