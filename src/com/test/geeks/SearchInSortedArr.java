package com.test.geeks;

public class SearchInSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {33,42,72,99};
		int key = 3;
		System.out.println(search(arr, key));
	}
	
	static int search(int[] arr, int key) {
        // code here
		int index = -1;
		if(arr[0]==key) {
			return 0;
		}
		else if(key<arr[0]) {
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]==key) {
					return i;
				}
			}
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==key) {
					return i;
				}
			}
		}
        return index;
    }

}
