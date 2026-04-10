package com.zoho.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Write a program that takes an integer M and M integer array elements as input. The program needs to find the minimum difference between two elements in the integer array. The program then needs to print all those pairs of elements that have the minimum difference. If more than one pair has the minimum difference, then the program should print the output in the ascending order, if an element exists in two or more pairs, then it should be printed two times or more.

//i/p: 4, 55 44 33 22


public class MinimumDiffPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,99,22,44,1001};
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		getPairs(list, 5).forEach(n-> System.out.println(n));
	}
	
	public static List<Integer> getPairs(List<Integer> list, int n){
		List<Integer> res = new ArrayList<>();
		Collections.sort(list);
		int minDiff = Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			if(minDiff>list.get(i+1)-list.get(i)) {
				minDiff = list.get(i+1)-list.get(i);
			}
		}
//		System.out.println(minDiff);
		for(int i=1;i<n;i++) {
			if(list.get(i)-minDiff==list.get(i-1)) {
				res.add(list.get(i-1));
				res.add(list.get(i));
			}
		}
		return res;
	}

	
}
