package com.test.hacker;

//The website considers a password to be strong if it satisfies the following criteria:
//
//Its length is at least 6.
//It contains at least one digit.
//It contains at least one lowercase English character.
//It contains at least one uppercase English character.
//It contains at least one special character. The special characters are: !@#$%^&*()-+

////numbers = "0123456789"
//lower_case = "abcdefghijklmnopqrstuvwxyz"
//upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//special_characters = "!@#$%^&*()-+"

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		String s = "790";
		System.out.println(minimumNumber(n, s));
	}

	public static int minimumNumber(int n, String password) {
	    // Return the minimum number of characters to make the password strong
		int missing = 0;
		boolean missingDig = false;
		boolean missingLc = false;
		boolean missingUc = false;
		boolean splChar = false;
		int reqLength = 0;
		if(password.length()<6) {
			reqLength = 6-password.length();
		}
		for(int i=0;i<n;i++) {
			if(password.charAt(i)<=90 && password.charAt(i)>=65) {
				missingUc = true;
				break;
			}
		}
		for(int i=0;i<n;i++) {
			if(password.charAt(i)>=97 && password.charAt(i)<=122) {
				missingLc = true;
				break;
			}
		}
		for(int i=0;i<n;i++) {
			if(password.charAt(i)<='9' && password.charAt(i)>='0') {
				missingDig = true;
				break;
			}
		}
		String splChars = "!@#$%^&*()-+";
		for(int i=0;i<splChars.length();i++) {
			if(password.contains(splChars.charAt(i)+"")) {
				splChar = true;
				break;
			}
		}
		if(!missingDig) missing+=1;
		if(!missingLc) missing+=1;
		if(!missingUc) missing+=1;
		if(!splChar) missing+=1;
		
		if(reqLength>0&&missing<=reqLength) {
			return reqLength;
		}
		return missing;
	}
}
