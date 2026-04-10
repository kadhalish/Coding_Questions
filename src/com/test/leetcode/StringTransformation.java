package com.test.leetcode;

public class StringTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthAfterTransformations("abcyy", 2));
	}

	public static int lengthAfterTransformations(String s, int t) {
//		final int MOD = 1000000007;
		
		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<t;i++) {
			int[] freqNew = new int[26];
			for(int j=0;j<26;j++) {
				if(j==25) {
					freqNew[0]=(freqNew[0]+freq[25]);
					freqNew[1]=(freqNew[1]+freq[25]);
				}
				else {
					freqNew[j+1]=(freqNew[j+1]+freq[j]);
				}
			}
			freq = freqNew;
		}
		
		long sum=0;
		for(int j: freq)
			sum=(sum+j);
		
		return (int) sum;
	}
	

}
