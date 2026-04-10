package com.test.geeks;

import java.util.ArrayList;

public class RemoveDupFromSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,2,2,2,2};
		removeDuplicates(arr);
	}

	static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
		 ArrayList<Integer> list = new ArrayList<>();
	        int j=0;
	        list.add(arr[0]);
	        for(int i=1;i<arr.length;i++) {
	        	if(arr[i]!=arr[j]) {
	        		list.add(arr[i]);
	        		j=i;
	        	}
	        }
	        return list;
    }
}
