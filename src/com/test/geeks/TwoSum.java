package com.test.geeks;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, -1, 2, -3, 1};
		int target = -2;
		System.out.println(twoSum(arr, target));
	}
	
	static boolean twoSum(int arr[], int target) {
		Set<Integer> set = new HashSet<>();
		for(int a : arr) {
			int needed = target-a;
			if(set.contains(needed)) {
				return true;
			}
				set.add(a);
		}
       return false;
    }
}
