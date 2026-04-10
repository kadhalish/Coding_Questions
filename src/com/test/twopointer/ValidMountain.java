package com.test.twopointer;

//arr = [0,3,2,1]

public class ValidMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		System.out.println(isValidMount(arr));
	}
	
	public static boolean isValidMount(int[] arr) {
		
		int left = 0;
		
		while(left<arr.length-1 && arr[left]<arr[left+1]) {
			left++;
		}
		
		if(left==0 || left==arr.length-1)
			return false;
		
		while(left<arr.length-1 && arr[left]>arr[left+1]) {
			left++;
		}
		
		return left==arr.length-1;
	}

}
