package com.te.assignments;
//Write a method to add as many as numbers the programmer gives the inputs.

public class Array {
	
	public static void add(int...a ){
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		add(1,3,2,4,6,7,4,7,3,9,0,3);
	}

}
