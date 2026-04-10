package com.test.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Input: digits = [2,1,3,0]
Output: [102,120,130,132,210,230,302,310,312,320]
Explanation: All the possible integers that follow the requirements are in the output array. 
Notice that there are no odd integers or integers with leading zeros.*/


public class ThreeDgtEvenNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,1,3,0};
		for(int i : findEvnNums(arr)) {
			System.out.println(i);
		}
	}

	public static int[] findEvnNums(int[] arr) {
		Set<Integer> result = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) continue;
				for(int k=0;k<arr.length;k++) {
					if(i==k || j==k) continue;
					int d1 = arr[i];
					int d2 = arr[j];
					int d3 = arr[k];
					if(d1==0 || d3%2!=0)
						continue;
					int num = d1*100+d2*10+d3;
					result.add(num);
				}
			}
		}
		int[] resArray = result.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(resArray);
        return resArray;
	}
}
