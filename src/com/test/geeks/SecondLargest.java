package com.test.geeks;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 35, 1, 10, 34, 1};
		System.out.println(getSecondLargest(a));
	}

    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
            	secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
