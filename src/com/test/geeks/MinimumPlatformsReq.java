package com.test.geeks;

import java.util.Arrays;

/*Given arrival arr[] and departure dep[] times of trains on the same day, find the minimum number of platforms needed so that no train waits. A platform cannot serve two trains at the same time; if a train arrives before another departs, an extra platform is needed.

Note: Time intervals are in the 24-hour format (HHMM) , where the first two characters represent hour (between 00 to 23 ) and the last two characters represent minutes (this will be <= 59 and >= 0). Leading zeros for hours less than 10 are optional (e.g., 0900 is the same as 900).*/

public class MinimumPlatformsReq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {900, 1235, 1100};
		int dep[] = {1000, 1240, 1200};
		System.out.println(minPlatform(arr,dep));
	}

	public static int minPlatform(int arr[], int dep[]) {
        //  code here
		if(arr.length==1)
			return 1;
		int i=1;
		int j=0;
		int count=1;
		Arrays.sort(arr);
		Arrays.sort(dep);
		while(i<arr.length) {
			if(arr[i]>dep[j]) {
				i++;
				j++;
			}
			else {
				count++;
				i++;
			}
		}
        return count;
    }
	
}
