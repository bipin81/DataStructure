package com.practice;

public class ArraySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring the array
		int arr[] = new int[3];
		// initializing the array.
		arr[0] = 39;
		arr[1] = 78;
		arr[2] = 54;
		int cloneArray[]=arr.clone();
		
		for (int var : cloneArray) {
			System.out.print(var+" ");
		}
//		for(int i=0; i<cloneArray.length;i++) {
//			
//			System.out.print("the cone aray index is  :"+cloneArray[i]+" ");
//			
//		}
		System.out.println();
		// adding the two value
		addarray(arr);
	}

	private static void addarray(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];

		}
		System.out.println("the addition of the array is :"+ sum);

	}

}
