package com.test.geeks;
//A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people. A square matrix mat[][] of size n*n is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.
public class FindCelebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 1, 0},{0, 1, 0},{0, 1, 1}};
		System.out.println(celebrity(arr));
	}

	public static int celebrity(int mat[][]) {		
		int n = mat[0].length;
		int[] iKnow = new int[n];
		int[] theyKnow = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==1 && i!=j) {
				  iKnow[i]++;
				  theyKnow[j]++;
				}
			}
		}
		for(int i = 0;i<n;i++) {
			if(iKnow[i]==0 && theyKnow[i]==n-1) {
				return i;
			}
		}
		
       return -1;        
    }
}
