package com.test.twopointer;

public class ArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l = {1, 2, 3, 4, 5};
		reverse(l);
	}
	
	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			right--;
			left++;
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
