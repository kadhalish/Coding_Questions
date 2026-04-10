package com.test.geeks;

//You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).
//
//If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
//
//Note: Consider the element before the first element and the element after the last element to be negative infinity.
//
//Examples :

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int peakElement(int[] arr) {
		if(arr.length==1) {
			return 0;
		}
		if(arr[0]>arr[1])
			return 0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				return i;
			}
		}
		
        return arr.length-1;
    }
}
