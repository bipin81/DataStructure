package com.practice;

public class BubbleShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declaration and creation
		int[] intArray = new int[] { 20, 35, -22, 1, 7, -9, 25 };

		for (int lastUpdatedIndex = intArray.length - 1; lastUpdatedIndex > 0; lastUpdatedIndex--) {
			for (int i = 0; i < lastUpdatedIndex; i++) {

				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}

			}

		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	// method for swapping
	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
