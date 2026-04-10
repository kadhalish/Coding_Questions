package com.zoho.basic;

public class ConvertToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = printBinary(0); 
		for(int j=res.length-1;j>=0;j--) {
			System.out.print(res[j]);
		}
	}
	
	public static int[] printBinary(int n) {
		int[] binary = new int[32];
		int i=0;
		while(n>0) {
			binary[i]=n%2;
			n/=2;
			i++;
		}
		return binary;
	}

}
