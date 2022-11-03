package com.recursion;

public class Febonacci2 {
     /*
      * In this approach we have cache array variable*/
	private static long [] fibonacciCache;
	public static void main(String[] args) {
		int n=50;
		fibonacciCache= new long[n+1];
		System.out.println(febonacci(n));
	}

	private static long febonacci(int n) {
		if(n<=1) {
			return n;
		}
		if(fibonacciCache[n]!=0) {
			return fibonacciCache[n];
		}
		long nthFebonacciNo = febonacci(n-1)+febonacci(n-2);
		fibonacciCache[n]=nthFebonacciNo;
		return nthFebonacciNo;
	}

}
