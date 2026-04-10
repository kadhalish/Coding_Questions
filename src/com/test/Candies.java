package com.test;

public class Candies {

	public static void main(String[] args) {
		int[] a = {2,3,5,1,3};
		boolean[] b = new boolean[5];
		int extraCandies = 3;
		int max=5;
		for(int i=0;i<a.length;i++) {
			if(a[i]+extraCandies>=max) {
				b[i] = true;
			}
			else {
				b[i]=false;
			}
		}
		
		for(boolean j : b) {
			System.out.println(j);
		}
		

	}

}
