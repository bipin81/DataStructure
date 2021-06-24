package com.practice;

public class ArrayEight {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//addition of two array 
		//initialization and declaration..
		 int add1[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		 int add2[][]=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		 
		 //create the third array for storage
		 int add3[][]=new int [3][3];
		 
		 for (int i=0;i<add1.length;i++) {
			 for (int j=0; j<add2.length;j++) {
				 add3[i][j]=add1[i][j]+add2[i][j];
				 System.out.print(add3[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 
		

	}

}
