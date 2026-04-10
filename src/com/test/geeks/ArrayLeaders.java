package com.test.geeks;

import java.util.ArrayList;

public class ArrayLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {16, 17, 4, 3, 5, 2};
		leaders(a).forEach(n -> System.out.println(n));
	}
	
	public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int maxFromRight = arr[arr.length-1];
        list.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>0;i--){
            
            if(arr[i]>maxFromRight){
            	maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        return list;
    }

}
