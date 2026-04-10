package com.test.geeks;

//Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 
//
//Note: If multiple occurrences are there, please return the smallest index.

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,20};
		int k = 20;
		System.out.println(binarysearch(arr,k));
	}

	public static int binarysearch(int[] arr, int k) {
		int pivot = arr.length/2;
		int left = 0;
		int right = arr.length-1;		
		while(left<=right) {
			if(arr[pivot]==k)
				return pivot;
			if(k>arr[pivot]) {
				right=pivot;
			}
			else if(k<arr[pivot]) {
				left=pivot;
			}
			pivot=(right-left)/2;
		}
		
		return -1;
    }
	
}
