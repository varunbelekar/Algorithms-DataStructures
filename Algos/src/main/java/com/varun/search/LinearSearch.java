package com.varun.search;

import java.util.Scanner;

public class LinearSearch {
	public  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int index = -1;
		for (int i = 0; i < n; i++) {
			if(a[i] == m){
				index = i + 1;
			}
		}
		System.out.println(index);
		
	}
	
}
