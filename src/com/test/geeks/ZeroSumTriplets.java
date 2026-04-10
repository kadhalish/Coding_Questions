package com.test.geeks;

import java.util.Arrays;

//Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero. Return true if such a triplet exists, otherwise, return false.
public class ZeroSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-5, 3, 2, -1, 0, 1};
		System.out.println(findTriplets(arr));
	}
	
	public static boolean findTriplets(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int left = i+1;
			int right = arr.length-1;
			while(left<right) {
				int sum = arr[i]+arr[left]+arr[right];
				if(sum==0) {
					return true;
				}
				else if(sum>0) {
					right--;
				}
				else {
					left++;
				}
			}
		}
        return false;
    }
}
