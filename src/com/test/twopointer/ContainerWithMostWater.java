package com.test.twopointer;

//[1,8,6,2,5,4,8,3,7]

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,6,8,2,5,4,8,3,7};
		System.out.println(getArea(a));
	}

	public static int getArea(int[] arr) {
		int maxArea = 0;
		int area = 0;
		int left =0;
		int right = arr.length-1;
		
		while(left<right) {
			if(arr[left]<arr[right]) {
				area = (right-left)*arr[left];
				left++;
			}
			else if(arr[left]>arr[right]) {
				area = (right-left)*arr[right];
				right--;
			}
			else {
				area=(right-left)*arr[left];
				right--;
			}
			
			if(area>maxArea)
				maxArea = area;
		}
				
		return maxArea;
	}
}
