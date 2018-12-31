package com.shams.hr.problemsolving;

/**
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in arr 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

For example, given the 2D array:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

test case 2
-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5
 * @author shamsulhaque
 *
 *https://www.hackerrank.com/challenges/2d-array/problem
 */
public class TwoDArrayDS {

	public static void main(String[] args) {
		//System.out.println(hourglassSum(new int[][] {{1, 1, 1, 0, 0, 0,}, {0, 1, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0},
		//	{0, 0, 2, 4, 4, 0},{0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}}));
		
		System.out.println(hourglassSum(new int[][] {{-1, -1, 0, -9, -2, -2}, {-2, -1, -6, -8, -2, -5},{-1, -1, -1, -2, -3, -4},
			{-1, -9, -2, -4, -4, -5},{-7, -3, -3, -2, -9, -9}, {-1, -3, -1, -2, -4, -5}}));

	}
	
	 static int hourglassSum(int[][] arr) {
		 int row = 0, col = 0;
		 int max = 0;
		 int count = 0;
		 while (true) {
			 if (row + 2 < arr.length && arr[row].length > col + 2) {
				 int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + 
						 arr[row + 1][col + 1] + 
						 arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
				 if (count == 0 || sum > max) {
					 max = sum;
					 count = 1;
				 }
				 row ++;
			 } else if (arr[row].length >= col + 2 ) {
				 row  = 0;
				 col++;
			 } else {
				 break;
			 }
		 }
		 return max;
	    }

}
