package com.test.geeks;

import java.util.Arrays;

//Given a array arr[] and positive integer k denoting heights of towers, you have to modify the height of each tower either by increasing or decreasing them by k only once.
//
//Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower. The modified height of the tower can be negative.
public class MinimizeTheHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,6,8,4,9,10};
		// [1,1,4,6,6,8,9,10]
		System.out.println(getMinDiff(a, 7));
	}

	public static int getMinDiff(int[] arr, int k) {
		Arrays.sort(arr);
		int minDiff = arr[arr.length - 1] - arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			int minHeight = Math.min(arr[0] + k, arr[i + 1] - k);
			int maxHeight = Math.max(arr[i] + k, arr[arr.length - 1] - k);

			minDiff = Math.min(minDiff, maxHeight - minHeight);
		}

		return minDiff;

	}
}
