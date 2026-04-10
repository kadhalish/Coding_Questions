package com.test.hacker;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "SOSSPSSQSSOR";
System.out.println(marsExploration(s));
	}

	public static int marsExploration(String s) {
		int count = 0;
		for(int i=0; i<=s.length()-3;i+=3) {
			String subStr = s.substring(i,i+3);
			if(subStr.charAt(0)!='S') {
				count++;
			} 
			if(subStr.charAt(1)!='O'){
				count++;
			}
			if(subStr.charAt(2)!='S') {
				count++;
			}
		}
		return count;
	}
}
