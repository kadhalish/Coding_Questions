package com.zoho.basic;

public class RemoveSingleVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeSingleVowels("Compuuter"));
	}

	public static String removeSingleVowels(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!isVowel(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
			else {
				boolean isPrevVowel = (i>0 && isVowel(s.charAt(i-1)));
				boolean isNextVowel = (i<s.length()-1 && isVowel(s.charAt(i+1)));
				
				if(isPrevVowel || isNextVowel) {
					sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString();
	}
	
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}
}
