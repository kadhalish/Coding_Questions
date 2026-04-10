package com.test.hacker;

public class HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hackerrankInString("hacakaeararanaka"));
	}

	public static String hackerrankInString(String s) {
		String temp = "hackerrank";
		int j = 0;
		int i=0;
		String res = "";
		while(i<s.length() && j<temp.length()) {
			if (s.charAt(i) == temp.charAt(j)) {
				res += s.charAt(i);
				j++;
			}
			i++;
		}
		if(res.equals(temp))
		return "YES";
		
		return "NO";
	}
}
