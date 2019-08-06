package com.varun.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static int[] bubbleSort(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] =  sc.nextInt();
		}
		a = bubbleSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
