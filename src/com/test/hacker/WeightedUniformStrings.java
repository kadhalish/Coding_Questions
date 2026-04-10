package com.test.hacker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		int[] arr = {1,7,5,4,15};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		weightedUniformStrings("abbcccdddd", list).stream().forEach(n -> System.out.println(n));
	}
	
	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
	   List<Integer> weights = new ArrayList<>();
	   weights.add(0,s.charAt(0)-'a'+1);
	   for(int i=1;i<s.length();i++) {
		   int weight = s.charAt(i)-'a'+1;
		   if(s.charAt(i)==s.charAt(i-1)) {
			   weight+=weights.get(i-1);
		   }
		   weights.add(i,weight);
	   }
	   List<String> res = new ArrayList<>();
	  for(int i=0;i<queries.size();i++) {
		  if(weights.contains(queries.get(i))) {
			  res.add(i,"Yes");
		  }
		  else {
			  res.add(i,"No");
		  }
	  }
	  return res;
	}

}
