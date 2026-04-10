package com.test.twopointer;

//nums = [2,0,2,1,1,0]


public class DutchFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,0,1,2};
		arrangeDutchFlag(a);
	}
	
	public static void arrangeDutchFlag(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length-1;
		
		while(mid<=high) {
			if(nums[mid]==0) {
				swap(nums, mid, low);
				mid++;
				low++;
			}
			else if(nums[mid] == 1) {
				mid++;
			}
			else {
				swap(nums, mid, high);
				high--;
				mid++;
			}
		}
		for(int a: nums)
			System.out.println(a);
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
