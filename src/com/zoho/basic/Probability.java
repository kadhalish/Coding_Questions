package com.zoho.basic;

//Your task is to complete a function “count_heads()” that takes two inputs N and R. The function should return the probability of getting exactly R heads on N successive tosses of a fair coin. A fair coin has an equal probability of landing a head or a tail (i.e. 0.5) on each toss.

public class Probability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getProbability(1, 1));
	}

	public static double getProbability(int N, int R) {
		
		double res = fact(N)/fact(N-R)*fact(R);
		res = res/Math.pow(2, N);
		return res;
	}
	
	public static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}
}
