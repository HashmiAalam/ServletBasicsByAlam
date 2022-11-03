package com.corepackage;

import java.util.Random;

public class QuickSortAlgo2 {

	public static void main(String[] args) {

		Random random=new Random();
		int[] noArray=new int[10000];
		for(int i=0;i<noArray.length;i++) {
			noArray[i]=random.nextInt(1000);
		}
		System.out.println("Befor sort");
		printArray(noArray);
		System.out.println("\nAfter sort");
		quickSort(noArray);
		printArray(noArray);
	}

	private static void quickSort(int[] inputArray) {
		quickSort(inputArray,0,inputArray.length-1);
	}

	private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		int pivotIndex=new Random().nextInt(highIndex-lowIndex)+lowIndex;
		int pivot=inputArray[pivotIndex];
		swap(inputArray,pivotIndex,highIndex);
		int leftPointer = partetion(inputArray, lowIndex, highIndex, pivot);
		quickSort(inputArray, lowIndex, leftPointer-1);
		quickSort(inputArray,leftPointer+1,highIndex);
	}

	private static int partetion(int[] inputArray, int lowIndex, int highIndex, int pivot) {
		int leftPointer=lowIndex;
		int rightPointer=highIndex;
		while(leftPointer<rightPointer) {
			while(inputArray[leftPointer]<=pivot && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(inputArray[rightPointer]>=pivot && leftPointer<rightPointer) {
				rightPointer--;
			}
			swap(inputArray,leftPointer,rightPointer);
		}
		swap(inputArray,leftPointer,highIndex);
		return leftPointer;
	}

	private static void swap(int[] inputArray, int index1, int index2) {
		int temp=inputArray[index1];
		inputArray[index1]=inputArray[index2];
		inputArray[index2]=temp;
	}

	private static void printArray(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
	}

}
