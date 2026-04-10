package com.test.slidingWindow;

import java.util.ArrayList;

/*Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.*/

public class IndexesOfSubArrSum {

	public static void main(String[] args) {
		int[] a = {1,2,0,3,7,5};
		subarraySum(a,12).forEach(n -> System.out.println(n));
	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int sum=0;
        int start=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int end=0;end<arr.length;end++){
            sum+=arr[end];
            while(sum>target){
                sum=sum-arr[start];
                start++;
            }
            if(sum==target){
                list.add(start+1);
                list.add(end+1);
                break;
            }
        }
        return list;
    }
	
}
