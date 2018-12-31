package com.shams.hr.problemsolving;


/**
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 * Sample Input
 * 5 4
 * 1 2 3 4 5
 * Sample Output
 * 5 1 2 3 4
 * @author shamsulhaque
 *
 */
public class LeftRotation {

	public static void main(String[] args) {
		for (int i : leftShift(7, 2, new int []{1, 2, 3, 4, 5, 6, 7}))
			System.out.print(" "+i);

	}
	
	static int [] leftShift(int n, int d, int [] a) {
		for (int i = 1; i <= d; i++ ) {
			int temp = a [0];
			for (int j = 0; j < n - 1; j++ ) {
				a[j] = a[j + 1];
			}
			a[n - 1] = temp;
		}
		return a;
		
	}

}
