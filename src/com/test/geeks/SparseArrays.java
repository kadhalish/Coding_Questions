package com.test.geeks;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
		List<Integer> count = new ArrayList<>();
		for(int i=0;i<queries.size();i++) {
			int val = 0;
			if(stringList.contains(queries.get(i))) {
				for(String list : stringList) {
					if(queries.get(i).equals(list)) {
						val++;
					}
				}
			}
			count.add(i, val);
		}
		return count;
	}
}
