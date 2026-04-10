package com.test.geeks;

import java.util.Stack;

//Input: s = "[{()}]"
//Output: true
//Explanation: All the brackets are well-formed.

public class ParenthesisChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "}";
		System.out.println(isBalanced(s));
	}
	
	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='[' || s.charAt(i)=='{'|| s.charAt(i)=='(') {
				stack.push(s.charAt(i));
			}
			else {
				if(stack.size()==0)
					return false;
				char pop = stack.pop();
				if(s.charAt(i)==')' && pop != '(') {
					return false;
				}
				else if(s.charAt(i)=='}' && pop != '{') {
					return false;
				}
				else if(s.charAt(i) == ']' && pop != '[') {
					return false;
				}
				
			}
		}
		return stack.size()>0?false:true;
	}

}
