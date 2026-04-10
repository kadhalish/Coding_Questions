package com.zoho.basic;

//Write a program that will print the sum of diagonal elements of a 10X10 matrix. The program will take a total of 100 numbers as input (10 numbers will be input per line and each number will be separated by a space).

public class SumOfDiagonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int sumOfDiagonal(int[][] a) {
		int sum=0;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		return sum;
	}
}
