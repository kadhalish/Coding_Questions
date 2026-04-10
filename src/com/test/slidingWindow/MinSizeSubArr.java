package com.test.slidingWindow;

/*3. Minimum Size Subarray Sum
🔹 Type: Shrinking window
Problem:
Given an array of positive integers nums and an integer target, return the minimal length of a subarray whose sum is ≥ target. Return 0 if no such subarray exists.

🧪 Example:
target = 7, nums = [2,3,1,2,4,3] → Output: 2 ([4,3])*/



public class MinSizeSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(minSizeAubArr(a, target));
	}
	
	public static int minSizeAubArr(int[] arr, int target) {
		int minValue = Integer.MAX_VALUE;
		int start = 0;
		int sum = 0;
		for (int end = 0; end < arr.length; end++) {
			sum += arr[end];
			while (sum>=target) {
				if (minValue > end - start + 1) {
					minValue = end - start + 1;
				}
				sum -= arr[start];
				start++;
			}
		}

		return minValue == Integer.MAX_VALUE ? 0 : minValue;
	}

}
