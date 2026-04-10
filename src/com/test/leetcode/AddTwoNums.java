package com.test.leetcode;

public class AddTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		int l1Values = 0;
		while (temp1.next != null) {
			l1Values = l1Values * 10 + temp1.val;
			temp1 = temp1.next;
		}
		int l2Values = 0;
		ListNode temp2 = l2;
		while (temp2.next != null) {
			l2Values = l2Values * 10 + temp2.val;
			temp2 = temp2.next;
		}

		return temp2;
	}
}
