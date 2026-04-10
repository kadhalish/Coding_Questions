package com.test.geeks;

//Given an array of integers arr[]. You have to find the Inversion Count of the array. 
//Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

public class CountInversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 1, 3, 5};
		System.out.println(inversionCount(arr));
	}

	static int inversionCount(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		int count = 0;
		while (left < right) {
			while(left<right) {
				if(arr[left]>arr[right]) {
					count++;
				}
				right--;
			}
			left++;
			right = arr.length-1;
		}
		return count;
	}
}
