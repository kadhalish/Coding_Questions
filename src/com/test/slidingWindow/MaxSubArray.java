package com.test.slidingWindow;

/*1. Maximum Sum Subarray of Size K
 Type: Fixed window size
Problem:
Given an array of integers arr and an integer k, find the maximum sum of any subarray of size k.

 Example:
arr = [2, 1, 5, 1, 3, 2], k = 3 → Output: 9 (from subarray [5,1,3])*/



public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 1, 5, 1, 3, 2};
		getMaxSubArray(a, 3);
	}
	
	public static void getMaxSubArray(int[] arr, int k) {
		int res = 0;
		int sum = 0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		
		for(int i=k;i<arr.length;i++) {
			sum = sum-arr[i-k]+arr[i];
			if(sum>res)
				res=sum;
		}
		System.out.println(res);
	}

}
