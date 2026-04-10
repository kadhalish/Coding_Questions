package com.test.geeks;

public class MaxProductSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 6, -3, -10, 0, 2};
		System.out.println(maxProduct(arr));
	}
	static int maxProduct(int[] arr) {
        // code here
        int maxEnding = arr[0];
        int maxSoFar = arr[0];
        for(int i=1;i<arr.length-1;i++){
            maxEnding = Math.max(arr[i],maxEnding*arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
}
