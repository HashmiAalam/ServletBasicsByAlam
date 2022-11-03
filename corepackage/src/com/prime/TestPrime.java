package com.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * the prime no is hole no which is greater then 1 
 * and it is divisible by 1 and by its on e.g. 7 is a prime no*/
public class TestPrime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter limit");
		int limit = scanner.nextInt();
		List<Integer> primeNumbers=new ArrayList<Integer>();
		for(int numberToCheck=2;numberToCheck<=limit;numberToCheck++) {
			boolean isPrime=true;
			for(int factor=2;factor<=numberToCheck/2;factor++) {
				if(numberToCheck % factor==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				primeNumbers.add(numberToCheck);
			}
		}
		System.out.println("The prime nos till "+limit+" is ");
		for(int no:primeNumbers) {
			System.out.println(no);
		}
	}

}
