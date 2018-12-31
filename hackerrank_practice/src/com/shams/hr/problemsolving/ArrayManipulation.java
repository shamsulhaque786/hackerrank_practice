package com.shams.hr.problemsolving;

/**
 * Starting with a 1-indexed array of zeros and a list of operations, 
 * for each operation add a value to each of the array element between two given indices, inclusive. 
 * Once all operations have been performed, return the maximum value in your array.
 * @author shamsulhaque
 * {@link https://www.hackerrank.com/challenges/crush/problem}
 */
public class ArrayManipulation {

	public static void main(String[] args) {	
		System.out.println(arrayManipulation(10, new int[][]{{1, 5, 3}, {4, 8, 7}, {6, 9, 1}}));

	}
	
	 static long arrayManipulation(int n, int[][] queries) {long max = 0l;
     long sum = 0l;
     long [] array = new long [n];
     for (int  i = 0; i < queries.length; i++) {
         int a = queries[i][0];
         int b = queries[i][1];
         long value = queries[i][2];
         array[a - 1] += value;
         if (b < n) array[b] -= value;
     }

     for (int i = 0; i < n; i++) {
         sum += array[i];
         if (max < sum)  max = sum;
     }
     return max;}

}
