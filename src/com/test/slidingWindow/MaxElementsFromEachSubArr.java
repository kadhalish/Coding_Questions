package com.test.slidingWindow;

import java.util.ArrayList;
import java.util.List;

/*Given an array nums and an integer k, return a list of the maximum element in every subarray (window) of size k as you slide the window from left to right.
*/


public class MaxElementsFromEachSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		getMaxElements(arr, k).forEach(a -> System.out.println(a));
	}
	
	public static List<Integer> getMaxElements(int[] arr, int k){
		List<Integer> maxElements = new ArrayList<>();
		for(int i=0;i<=arr.length-k;i++) {
			int max = Integer.MIN_VALUE;
			int j=i;
			while(j<i+k) {
				if(arr[j]>max) {
					max = arr[j];
				}
				j++;
			}
			maxElements.add(max);
		}
		return maxElements;
	}
}
