package com.test.geeks;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10, 4, 20, 15};
		System.out.println(kthSmallest(arr, 4));
	}

	public static int kthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i: arr) {
			if(maxHeap.size()>=k && maxHeap.peek()>=i) {
				maxHeap.remove();
			}
			if(maxHeap.size()>=k && i>maxHeap.peek())
				continue;
			maxHeap.add(i);
		}
		
        return maxHeap.peek();
    }
}
