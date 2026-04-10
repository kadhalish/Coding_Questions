package com.test.permutations;

public class ArrayPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		permute(a, 0);
	}
	
	public static void permute(int[] nums, int start) {
		if(start==nums.length) {
			for(int a: nums)
				System.out.println(a);
			return;
		}
		for(int i=start;i<nums.length;i++) {
			swap(nums, start,i);
			permute(nums, start+1);
			swap(nums, start, i);
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

}
