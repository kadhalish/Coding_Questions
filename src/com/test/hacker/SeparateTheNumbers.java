package com.test.hacker;

public class SeparateTheNumbers {

	public static void main(String[] args) {
		separateNumbers("90071992547409929007199254740993");
	}

	public static void separateNumbers(String s) {
		String numb = "";
		for(int i=0;i<s.length()/2;i++) {
			numb+=s.charAt(i);
			long num = Long.valueOf(numb);
			String res = getAppendedStr(num, s);
			if(res.equals(s)) {
				System.out.println("YES "+num);
				return;
			}
		}
		System.out.println("NO");
	}
	
	public static String getAppendedStr(long n, String s) {
		String res = n+"";
		while(s.length()>res.length()) {
			n++;
			res+=(long)n;
		}
		return res;
	}
}
