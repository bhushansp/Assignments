package com.te.assignments;

import java.util.Scanner;

public class Fibonaci {
	
	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		System.out.println("Fibonaci Series");
		
		int n=S.nextInt();
		int first=0;
		int second=1;
		int third;
		
		System.out.println(first+ ",");
		System.out.println(second+ ",");
		
		for(int i=0;i<n;i++){
			third=first+second;
			System.out.println(third+ ",");
			first=second;
			second=third;
		}
		

	}

}
