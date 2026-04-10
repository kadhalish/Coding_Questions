package com.test.geeks;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 180, 260, 310, 40, 535, 695};
		System.out.println(stockBuySell(arr));
	}

	static int stockBuySell(int arr[]) {
        // code here
		int sum=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				sum+=arr[i]-arr[i-1];
			}
		}
        return sum;
    }
}
