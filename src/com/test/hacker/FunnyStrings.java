package com.test.hacker;

import java.util.ArrayList;
import java.util.List;

public class FunnyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(funnyString("ivvkx"));
	}
	
	public static String funnyString(String s) {
	    // Write your code here
	    List<Integer> list1 = new ArrayList<>();
	    List<Integer> list2 = new ArrayList<>();
	    for(int i=1;i<s.length();i++) {
	    	list1.add(Math.abs(s.charAt(i)-s.charAt(i-1)));
	    }
	    String rev = "";
	    int i=s.length()-1;
	    while(i>=0) {
	    	rev+=s.charAt(i);
	    	i--;
	    }
	    for(int j=1;j<rev.length();j++) {
	    	list2.add(Math.abs(rev.charAt(j)-rev.charAt(j-1)));
	    }
	    
	    for(int k=0;k<list1.size();k++) {
	    	if(list1.get(k)!=list2.get(k)) {
	    		return "Not Funny";
	    	}
	    }
	    return "Funny";
	}

}
