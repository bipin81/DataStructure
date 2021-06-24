package com.practice;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declaration
		int arr[];
		// array initialization
		arr = new int[5];
		// value initialization
		arr[0] = 30;
		arr[1] = 40;
		arr[2] = 50;
		arr[3] = 60;
		arr[4] = 70;

		// fetching the value
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("array element : " + i + " is " + arr[i]);
//		}
		
		//fetch using the for each loop
		for(int var:arr) {
			System.out.println("this is array value : "+ var);
			
			
		}

	}

}
