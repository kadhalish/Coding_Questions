package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "leetcode";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			map.putIfAbsent(c, 1);
		}
		
		for(char c : map.keySet()) {
			if(map.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
	}
	

}
