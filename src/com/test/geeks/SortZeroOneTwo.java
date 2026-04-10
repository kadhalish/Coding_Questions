package com.test.geeks;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 1, 2, 0, 1, 2};
			sort012(a);
	}
	
    public static void sort012(int[] arr) {
        int mid = 0;
        int low = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr, mid, high);
                high--;
            }
        }
        for(int num : arr)
        	System.out.println(num);
        
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
