

package com.test;

public class LongestSubStringWithoutRepChars {
	
	public static void main(String[] args) {
		String s = "super";
		System.out.println(recur(s,s.length()-1,""));
	}

	public static String recur(String s, int i, String res) {
		res = res + s.charAt(i);
		if(i==0)
			return res;
		return recur(s, i-1, res);
	}
}
