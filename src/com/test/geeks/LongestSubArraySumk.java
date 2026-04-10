package com.test.geeks;

import java.util.HashMap;

//
//Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

public class LongestSubArraySumk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 2, 7, 1, -10};
		System.out.println(longestSubarray(arr,15));
	}
	
	 public static int longestSubarray(int[] arr, int k) {
		 int length = -1;
		 int sum = 0;
		 HashMap<Integer,Integer> map = new HashMap<>();
	        for(int right = 0;right<arr.length;right++) {
	        	sum+=arr[right];
	        	if(sum==k) {
	        		length = right+1;
	        	}
	        	if(map.containsKey(sum-k)) {
	        		int l = right-map.get(sum-k);
	        		length = Math.max(length, l);
	        	}
	        	map.putIfAbsent(sum, right);
	        }
	        return length;
	    }

}
