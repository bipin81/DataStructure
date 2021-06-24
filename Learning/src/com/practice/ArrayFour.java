package com.practice;
class Army{
	int id;
	String batch;
	String name;
	double sal;
	//define the constructor
	Army(int id,String batch,String name,double sal){
		this.id=id;
		this.batch=batch;
		this.name=name;
		this.sal=sal;
	}
}
public class ArrayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aray declaration and initialization 
		Army arr[]=new Army[4];
		
//		arr[0]=new Army(101,"sfsd","namal",555.89);
//		arr[1]=new Army(102,"dfdd","namal",5553.89);
//		arr[2]=new Army(103,"sfddsd","namal",5534325.89);
//		arr[3]=new Army(104,"sfddsd","namal",554345.89);
		
		//
		for(int i=0; i<arr.length;i++) {
			
			System.out.println("the army detaisl is "+arr[i].id+" "+arr[i].batch+" "+arr[i].name+" "+arr[i].sal);
		}
		

	}

}
