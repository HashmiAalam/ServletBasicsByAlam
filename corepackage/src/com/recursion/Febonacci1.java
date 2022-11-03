package com.recursion;

public class Febonacci1 {
     /*
      * In this approach we have slowness*/
	public static void main(String[] args) {
		int n=6;
		System.out.println(febonacci(n));
	}

	private static long febonacci(int n) {
		if(n<=1) {    //0 and 1 are starting values of fibonacci list
			return n;
		}
		return (febonacci(n-1)+febonacci(n-2));
	}

}
