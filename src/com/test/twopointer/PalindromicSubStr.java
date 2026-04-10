package com.test.twopointer;

public class PalindromicSubStr {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("bswrhxboawtdfqggqfdtwyypwnssnwpyyaobxhrwsb"));
	}
	
	public static String longestPalindrome(String s) {
		if(s==null || s.length()<1)
			return "";
		int start = 0; int end =0;
		for(int i=0;i<s.length();i++) {
			int len1 = expandAroundCentre(s,i,i);
			int len2 = expandAroundCentre(s,i,i+1);
			int len = Math.max(len1, len2);
			
			if(len>end-start+1) {
				start = i-(len-1)/2;
				end = i+len/2;
			}
		}
		return s.substring(start,end+1);
	}
    
    public static int expandAroundCentre(String str, int left, int right) {
    	while(left>=0 && right<str.length() && str.charAt(right)==str.charAt(left)) {   		
    		left--;
    		right++;
    	}
    	return right-left-1;
    }
}
