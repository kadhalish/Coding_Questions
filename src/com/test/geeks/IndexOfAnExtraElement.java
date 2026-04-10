package com.test.geeks;

//You have given two sorted arrays arr1[] & arr2[] of distinct elements. The first array has one element extra added in between. Return the index of the extra element.
//
//Note: 0-based indexing is followed.

public class IndexOfAnExtraElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {433,483,577,685,800,850,940};
		int[] arr2 = {433,483,577,685,800,850};
		System.out.println(findExtra(arr1, arr2));
	}

	public static int findExtra(int a[], int b[]) {
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				return i;
			}
		}
		return a.length-1;
	}

}
