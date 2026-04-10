package com.test.geeks;

//Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

//Note: Consider the array as circular.

//Input: arr[] = [1, 2, 3, 4, 5], d = 2

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 3, 9, 1 };
		int d = 9;
		rotateArr(arr, d);
	}

	static void rotateArr(int arr[], int d) {
		// add your code here
		if (d > arr.length) {
			d = d % arr.length;
		}
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void reverse(int[] arr, int left, int right) {
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
