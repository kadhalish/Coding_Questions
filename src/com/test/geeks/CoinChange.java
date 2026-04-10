package com.test.geeks;

import java.util.Arrays;

//You are given an array coins[], where each element represents a coin of a different denomination, and a target value sum. You have an unlimited supply of each coin type {coins1, coins2, ..., coinsm}.

//Your task is to determine the minimum number of coins needed to obtain the target sum. If it is not possible to form the sum using the given coins, return -1.
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minCoins(int coins[], int sum) {
		int count = 0;
		if (sum == 0) {
			return 0;
		}
		Arrays.sort(coins);
		for(int i=coins.length-1;i>=0;i--) {
			if(coins[i]>sum) {
				continue;
			}
			else if(coins[i]==sum) {
				count=1;
				break;
			}
			else {
				int div = sum/coins[i];
				
			}
		}
		return count;
	}
}
