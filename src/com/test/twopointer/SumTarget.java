package com.test.twopointer;

/*Find Two Numbers that Add up to Target (Sorted Array Version)

You are given a sorted array of integers arr and a target value target.
Find two numbers such that they add up exactly to the target and return their indices (1-based indexing).

You must use the Two Pointers approach to solve this efficiently.*/

public class SumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		int target = 9;

		int[] res = getIndices(target, arr);
		for(int a : res)
			System.out.println(a);
	}
	
	public static int[] getIndices(int target,int[] arr) {
		int[] c = new int[2];
		int k=0;
		
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			if(arr[left]+arr[right]==target) {
				c[k]=left;
				c[k+1]=right;
				break;
			}
			else if(arr[left]+arr[right]>target) {
				right--;
			}
			else if(arr[left]+arr[right]<target) {
				left++;
			}
		}
		
		return c;
	}

}
