package com.practice;

public class ArraySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the sum of thr array

		// declaring the array value
		int arr[] = { 3, 5, 6, 7, 8 };

		// to find the sum of the array
		sum(arr);
	}

	private static void sum(int[] arr) {
		// TODO Auto-generated method stub
		int add = 0;

		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];
		}

		System.out.println(" the addition is :" + add);
	}

}
