package com.test.hacker;

public class TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "beabeefeab";
		System.out.println(alternate(s));
	}

	public static int alternate(String s) {
		
		if(s.length()==1) {
			return 0;
		}
		
		int[][] pair = new int[26][26];
		int[][] count = new int[26][26];
		int maxCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int letter = ch - 'a';

			for (int col = 0; col < 26; col++) {
				if (pair[letter][col] == ch) {
					count[letter][col] = -1;
				}
				if (count[letter][col] != -1) {
					pair[letter][col] = ch;
					count[letter][col]++;
				}
			}

			for (int row = 0; row < 26; row++) {
				if (pair[row][letter] == ch) {
					count[row][letter] = -1;
				}
				if (count[row][letter] != -1) {
					pair[row][letter] = ch;
					count[row][letter]++;
				}
			}
		}

		for (int row = 0; row < 26; row++) {
			for (int col = 0; col < 26; col++) {
				maxCount = Math.max(maxCount, count[row][col]);
			}
		}
		return maxCount;
	}

}
