package com.test.geeks;

//Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxWater(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		int maxFromLeft = 0;
		int maxFromRight = 0;
		int water = 0;
		while (left < right) {
			if (arr[left] <= arr[right]) {
				if (arr[left] >= maxFromLeft) {
					maxFromLeft = arr[left];
				} else {
					water += maxFromLeft - arr[left];
				}
				left++;
			} else {
				if (arr[right] >= maxFromRight) {
					maxFromRight = arr[right];
				} else {
					water += maxFromRight - arr[right];
				}
				right--;
			}
		}
		return water;
    }
}
