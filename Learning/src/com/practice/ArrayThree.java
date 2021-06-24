package com.practice;

class Student {

	public int rollNo;
	public String name;

	Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

}

public class ArrayThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring the array and initializing the array;
		Student arr[] = new Student[3];

		// assigning the value to the array
		arr[0] = new Student(101, "Rama");
		arr[1] = new Student(102, "Sama");
		arr[2] = new Student(103, "Gama");

//		for(Student std:arr) {
//			System.out.println("the student is : " + std);
//			
//		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println("the array is: " + arr[i].rollNo + " " + arr[i].name);
		}

	}

}
