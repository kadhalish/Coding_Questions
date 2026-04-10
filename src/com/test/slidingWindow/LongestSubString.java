package com.test.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/*2. Longest Substring Without Repeating Characters
🔹 Type: Variable window size
Problem:
Given a string s, find the length of the longest substring without repeating characters.

🧪 Example:
s = "abcabcbb" → Output: 3 ("abc")*/

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "dvdf";
		System.out.println(getLongestSubString(s));
	}
	
	public static int getLongestSubString(String s) {
		int maxLength = 0;
		Map<Character, Integer> map = new HashMap<>();
		int left = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				left = Math.max(left, map.get(c)+1);
			}
			map.put(c, i);
			maxLength = Math.max(maxLength, i-left+1);
		}
		return maxLength;
	}
}
