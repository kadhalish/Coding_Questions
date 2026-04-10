package com.zoho.basic;
//
//Given a sentence with numbers representing a word’s location in the sentence, embedded within each word, and return the sorted sentence. 
//
//Note: We are using a maximum of 0-9 numbers only for 1 sentence
//
//Example 1
//
//Input:  is1 Thi0s T3est 2a
//Output:  This is a Test

public class SortedSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortTheString("is1 Thi0s T3est 2a"));
	}

	public static String sortTheString(String str) {
		String[] strArr = str.split(" ");
		String[] res = new String[strArr.length];
		for(String s : strArr) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					res[Integer.parseInt(s.charAt(i)+"")] = s.substring(0,i)+s.substring(i+1);
					break;
				}
			}
		}
		String result = "";
		for(String r : res) {
			result =result + r + " ";
		}
		return result;
	}
}
