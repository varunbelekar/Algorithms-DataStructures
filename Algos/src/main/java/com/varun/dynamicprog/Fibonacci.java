package com.varun.dynamicprog;

import java.time.Duration;
import java.time.Instant;

public class Fibonacci {

	public static long fibWoDp(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
//		return fibWoDp(n - 1) + fibWoDp(n - 2);
		return nextTerm(1, 2, n - 3);
	}
	
	static long nextTerm(long b, long c, int n) {
		if( n == 0 ) {
			return c;
		}
		
		return nextTerm(c, b + c, n - 1);
	}

	public static long fib(int n, long[] arr) {
		if (n == 1 || n == 2) {
			return 1;
		}
		if (arr[n - 1] != 0) {
			return arr[n - 1];
		}
		arr[n - 1] = fib(n - 1, arr) + fib(n - 2, arr);
		return arr[n - 1];
	}

	public static void main(String[] args) {
		int n = 50;
		long[] arr = new long[n];
		arr[0] = 1;
		arr[1] = 1;
		Instant start = Instant.now();
		System.out.println("Fibonacci with DP " + fib(n, arr));
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));

		start = Instant.now();
		System.out.println("Fibonacci without DP " + fibWoDp(n));
		end = Instant.now();
		System.out.println(Duration.between(start, end));

	}
}
