package com.test.geeks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. */

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(findEquilibrium(arr));
	}

	public static int findEquilibrium(int arr[]) {
		// code here
		int leftSum = arr[0];
		int sum = 0;
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		sum = intList.stream().mapToInt(Integer::intValue).sum();
		for (int i = 1; i < arr.length; i++) {
			if(leftSum == sum-arr[i]-leftSum) {
				return i;
			}
			leftSum+=arr[i];
		}

		return -1;
	}
}
