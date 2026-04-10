package com.test.geeks;

public class MinJumpsRequired {

	public static void main(String[] args) {
		int[] a = {2, 3, 1, 1, 4};
		System.out.println(minJumps(a));
	}
	
	static int minJumps(int[] arr) {
		if (arr[0] == 0)
			return -1;
		if (arr.length <= 1)
			return 0;
		int count = 1;
		int maxReach = arr[0];
		int steps = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (i == arr.length - 1)
				return count;
			maxReach = Math.max(maxReach, arr[i] + i);
			steps--;
			if (steps == 0) {
				count++;
				if (i >= maxReach)
					return -1; // cannot move further
				steps = maxReach - i;
			}
		}
		return -1;
	}

}
