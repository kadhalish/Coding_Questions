package com.test.leetcode;

public class ThreeConsOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,34,3,4,5,7,23,12};
		System.out.println(threeConsecutiveOdds(arr));
	}

	  public static boolean threeConsecutiveOdds(int[] arr) {
		  boolean isOdd = false;
	        for(int i=0;i<=arr.length-3;i++){
	            if(arr[i]%2!=0){
	                int start=i+1;
	                while(start<i+3){
	                    if(arr[start]%2!=0){
	                        isOdd = true;
	                    }
	                    else{
	                        isOdd = false;
	                        break;
	                    }
	                    start++;
	                }
	                if(isOdd)
	                	return isOdd;
	                
	            }
	        }
	        return isOdd;
	    }
}
