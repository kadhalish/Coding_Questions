package com.test.geeks;

import java.util.ArrayList;
import java.util.List;

//Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

//Note: If no such array is possible then, return [-1].
public class IndexesOfSubArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {19, 23, 15, 6, 6, 2, 28, 2};
		int k = 2;
		getIndices(arr, k).forEach(n -> System.out.println(n));
	}

	public static List<Integer> getIndices(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0;
		int left=0;
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			while(sum>target) {
				sum = sum-arr[left];
				left++;
			}
			if(sum==target) {
				list.add(left+1);
				list.add(right+1);
				break;
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
		}
		return list;
	}
}
