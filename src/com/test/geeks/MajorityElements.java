package com.test.geeks;

import java.util.HashMap;

//Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
//
//Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

public class MajorityElements {

	public static void main(String[] args) {
		int[] a = {1, 1, 2, 1, 3, 5, 1};
		System.out.println(majorityElement(a));
		
	}

	public static int majorityElement(int arr[]) {
		int majorVal = arr.length / 2;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (int n : map.keySet()) {
			if (map.get(n) > majorVal) {
				return n;
			}
		}
		return -1;
	}
}
