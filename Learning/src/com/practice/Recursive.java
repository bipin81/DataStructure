package com.practice;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int value=iterativeFactorial(6);
//		System.out.println("the factorial value is :	"+value );
		
		System.out.println(iterativeFactorial(5));
		System.out.println(recursiveFactorial(6));

	}

	// factorial for recursive method
	public static int recursiveFactorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num * recursiveFactorial(num - 1);
	}

	// factorial logic method for iterative factorial
	public static int iterativeFactorial(int num) {

		if (num == 0) {
			return 1;
		}

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;

	}

}
