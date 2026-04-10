package com.test.geeks;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 3, 2, 7, 8, 2, 3, 1};
		findDuplicates(a).forEach(n -> System.out.println(n));
	}
	
	public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1; // map value to index
            if (arr[index] < 0) {
                duplicates.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index]; // mark visited
            }
        }
        return duplicates;
    }

}
