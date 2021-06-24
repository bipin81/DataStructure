package com.practice;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declaration and initialization
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		// for gap we need to write the loop and transverse the loop and follow the
		// instruction etc....
		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

			// one other for loop for transversing the array....
			for (int i = gap; i < intArray.length; i++) {

				int newElement = intArray[i];
				int j = i;

				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;

				}
				intArray[j] = newElement;

			}

		}

		// array printing
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
