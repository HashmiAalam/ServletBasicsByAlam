package com.corepackage;

import java.util.Random;

public class InsertionSortAlgo {

	public static void main(String[] args) {
		Random random=new Random();
		int[] numbers=new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=random.nextInt(100);
		}
		System.out.println("Befor sorting");
		printArray(numbers);
		System.out.println("After sorting");
		sortArray(numbers);
		printArray(numbers);
	}

	private static void sortArray(int[] inputArray) {
		for(int i=1; i<inputArray.length;i++) {
			int currentValue=inputArray[i];
			int j=i-1;
			while(j>=0 && inputArray[j]>currentValue) {
				inputArray[j+1]=inputArray[j];
				j--;
			}
			inputArray[j+1]=currentValue;
		}
	}

	private static void printArray(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
	}

}
