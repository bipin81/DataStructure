package com.practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declaration and initialization

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		// use selection sort method which is it will find the largest element and then
		// it will transverse the array
		// position and so on............
		for (int lastUpdatedIndex = intArray.length - 1; lastUpdatedIndex > 0; lastUpdatedIndex--) {

			int largest = 0;

			for (int i = 1; i <= lastUpdatedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, lastUpdatedIndex);

		}

		// for display of array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
