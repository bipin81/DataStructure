package com.practice;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 20, 33, 10, 22, 1, -30 };

		for (int i = 1; i < intArray.length; i++) {
			int temp;
			temp = intArray[i];

			int j = i;
			while (temp > intArray[j - 1]) {
				intArray[j] = intArray[j - 1];
				j = j - 1;
			}

		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);

		}

	}

}
