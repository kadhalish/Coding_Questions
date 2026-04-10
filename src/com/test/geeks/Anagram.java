package com.test.geeks;
////Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
//Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "allergy";
		String s2 = "allergyy";
		System.out.println(areAnagrams(s1, s2));
	}

	public static boolean areAnagrams(String s1, String s2) {
		int[] arr = new int[26];
		for(int i=0;i<s1.length();i++) {
			arr[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++) {
			arr[s2.charAt(i)-'a']--;
		}
		for(int i : arr) {
			if(i!=0) {
				return false;
			}
		}
        return true;
    }
}
