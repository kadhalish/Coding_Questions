package com.test.geeks;

//You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 3, -8, 7, -1, 2, 3};
		System.out.println(maxSubarraySum(a));
	}
	
	public static int maxSubarraySum(int[] arr) {
		int maxEndingHere = arr[0];
		int maxSoFar = arr[0];
		for(int i=1;i<arr.length;i++) {
			maxEndingHere = Math.max(arr[i], arr[i]+maxEndingHere);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

}
