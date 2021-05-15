package com.varun.dynamicprog;

import java.util.Scanner;

public class KnapSack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int W = sc.nextInt();
			int n = sc.nextInt();
			int[] weights = new int[n];
			int[] values = new int[n];
			for (int j = 0; j < n; j++) {
				weights[j] = sc.nextInt();
				values[j] = sc.nextInt();
			}
			System.out.println(solveKnapSackWithDp(weights, values, W, n - 1, new int[W + 1]));
		}
	}
	
	public static int solveKnapSack(int[] weights, int[] values, int W, int n) {
		if (W <= 0 || n < 0) {
			return 0;
		}
		if (weights[n] > W) {
			solveKnapSack(weights, values, W, n - 1);
		}
		return Math.max(solveKnapSack(weights, values, W, n - 1), values[n] + solveKnapSack(weights, values, W - weights[n], n - 1));
	}
	
	public static int solveKnapSackWithDp(int[] weights, int[] values, int W, int n, int[] memo) {
		if (W <= 0 || n < 0) {
			return 0;
		}
		if(memo[W] != 0) {
			return memo[W];
		}
		if (weights[n] > W) {
			solveKnapSackWithDp(weights, values, W, n - 1, memo);
		}
		memo[W] =  Math.max(solveKnapSackWithDp(weights, values, W, n - 1, memo), values[n] + solveKnapSackWithDp(weights, values, W - weights[n], n - 1, memo));
		return memo[W];
	}
}
