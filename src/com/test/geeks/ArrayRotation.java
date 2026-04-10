package com.test.geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int k = 3;
		rotateArray(arr, k);
	}

	public static void rotateArray(int[] arr, int k) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> result = new ArrayList<>();
		result.addAll(list.subList(arr.length-k,arr.length));
		result.addAll(list.subList(0, arr.length-k));
		
		result.stream().forEach(n -> System.out.println(n));
	}
}
