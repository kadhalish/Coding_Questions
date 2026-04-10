package com.zoho.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayPrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,6,9,3,7};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		findPrimes(list).forEach(n -> System.out.println(n));
	}
	
	public static List<Integer> findPrimes(List<Integer> list){
		List<Integer> res = new ArrayList<>();
		for(int i : list) {
			if(isPrime(i)) {
				res.add(i);
			}
		}
		return res;
	}

	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
