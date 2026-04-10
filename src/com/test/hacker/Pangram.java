package com.test.hacker;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We promptly judged antique ivory buckles for the next prize";
		System.out.println(pangrams(s));
	}

	public static String pangrams(String s) {
	    // Write your code here
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<=90)){
				arr[s.charAt(i)-'A']++;
			}else if(s.charAt(i)>=97 && s.charAt(i)<=122){
				arr[s.charAt(i)-'a']++;
			}
		}
		for(int i : arr) {
			if(i==0) {
				return "not pangram";
			}
		}
		return "pangram";
	}
}
