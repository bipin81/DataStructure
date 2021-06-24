package com.practice;

public class ArrayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// two dimentional array declaratilon and initialization

		int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// array fetching process by using the for loop
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++)

				System.out.print(arr[i][j] + " ");

			System.out.println();

		}

	}

}
