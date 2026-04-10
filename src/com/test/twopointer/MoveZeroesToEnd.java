package com.test.twopointer;

//Input: arr = [1,1,0,3,12]


public class MoveZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		moveZeroes(arr);
	}
	
	public static void moveZeroes(int[] arr) {
		int i=0;
		
		for(int j=1;j<arr.length;j++) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				if(arr[i]!=arr[j])
				i++;
			}
			else {
				i++;
			}
		}
		
		for(int a: arr) {
			System.out.println(a);
		}
	}

}
