package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 7, 4, 5));
//		System.out.println(max(list));
		reverseSorted(list).forEach(n -> System.out.println(n));
//		System.out.println(sum(list));
	}

	public static int min(List<Integer> list) {
		int min = list.stream().min((a, b) -> a - b < 0 ? -1 : a == b ? 0 : 1).get();
		return min;
	}

	public static int max(List<Integer> list) {
		int max = list.stream().max((a, b) -> a - b < 0 ? -1 : a == b ? 0 : 1).get();
		return max;
	}

	public static List<Integer> map(List<Integer> list) {
		return list.stream().map(n -> n * n).filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

	public static int sum(List<Integer> list) {
		return list.stream().mapToInt(n -> n.intValue()).sum();
	}

	public static List<Integer> sorted(List<Integer> list) {
		return list.stream().sorted((a, b) -> a - b).collect(Collectors.toList());
	}

	public static List<Integer> reverseSorted(List<Integer> list) {
		return list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
	}

	public static void convertArrToList(int[] numbers) {
		List<Integer> list = Arrays.stream(numbers) // IntStream
				.boxed() // Stream<Integer>
				.collect(Collectors.toList());
	}
}
