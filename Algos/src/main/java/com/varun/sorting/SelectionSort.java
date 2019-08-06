package com.varun.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static int[] selectionSort(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i]  = sc.nextInt();
		}
		a = selectionSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
