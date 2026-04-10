package com.test.hacker;

import java.util.ArrayList;
import java.util.List;

public class Gemstones {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("abcdde");
		list.add("baccd");
		list.add("eeabg");
		System.out.println(gemstones(list));
	}
	
	public static int gemstones(List<String> arr) {
		int count = 0;
		boolean []bl = new boolean[26];
		String lowest = arr.stream().sorted((a,b) -> a.length()-b.length()).findFirst().get();
		for(int i=0;i<lowest.length();i++) {
			boolean contains = true;
			for(String s : arr) {
				if(!s.contains(lowest.charAt(i)+"")) {
					contains = false;
				}
				bl[lowest.charAt(i)-'a']=contains;
			}
		}
	    for(boolean res : bl) {
	    	if(res) {
	    		count++;
	    	}
	    }
	    return count;
	}

}
