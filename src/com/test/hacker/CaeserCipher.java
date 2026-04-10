package com.test.hacker;

public class CaeserCipher {

	public static void main(String[] args) {

		String s = "DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
		int k = 45;
		System.out.println(caesarCipher(s, k));
	}

	public static String caesarCipher(String s, int k) {
		// Write your code here
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) < 65 || s.charAt(i) > 90) && (s.charAt(i) < 97 || s.charAt(i) > 122)) {
				res = res + s.charAt(i);
				continue;
			}
			if (k > 26) {
				k = k % 26;
			}
			int val = s.charAt(i) + k;
			char ch = (char) (val);
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				if (val >= 65 && val <= 90) {
					res = res + ch;
				} else {
					ch = (char) (val - 26);
					res = res + ch;
				}
			}
			else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				if (val >= 97 && val <= 122) {
					res = res + ch;
				} else {
					ch = (char) (val - 26);
					res = res + ch;
				}
			}
		}
		return res;
	}

}
