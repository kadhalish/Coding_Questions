package com.test.geeks;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1};
		sortInWave(arr);
	}

	public static void sortInWave(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				swap(arr, i, i + 1);
			}
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
