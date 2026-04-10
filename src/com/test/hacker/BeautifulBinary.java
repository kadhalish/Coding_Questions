package com.test.hacker;

public class BeautifulBinary {

	public static void main(String[] args) {
		String s = "0101010";
		System.out.println(beautifulBinaryString(s));
	}
	
	public static int beautifulBinaryString(String b) {
		int count=0;
		for(int i=0;i<=b.length()-3;i++) {
			if(b.substring(i, i+3).equals("010")) {
				count++;
				i=i+2;
			}
		}
		return count;
	}

}
