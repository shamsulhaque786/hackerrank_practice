package com.shams.hr.problemsolving;

import java.util.Arrays;

/**
 * You are given a number of sticks of varying lengths. 
 * You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left.
 * At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer 
 * sticks and then discard all the pieces of that shortest length.
 * When all the remaining sticks are the same length, they cannot be shortened so discard them.
 * Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left.
 * 
 * @author shamsulhaque
 *
 */
public class CutTheSticks {

	public static void main(String[] args) {
		for (int i : cutTheSticks(new int [] {5,4,4,2,2,8}))
		System.out.println(i);

	}
	
	static int[] cutTheSticks(int[] arr) {
        int [] tempOuput = new int[arr.length];
        int outIndex = 0;
        Arrays.sort(arr);
        int beg = 0;
        for (int i = 0; i < arr.length - 1; i++) {            
            if (arr [i] < arr[i + 1]) {
                tempOuput[outIndex] = arr.length - beg;
                outIndex++;
                beg = i + 1;
                int t = beg;
                while (t <= arr.length - 1) {
                    arr[t] -= arr[i]; 
                    t++;
                }
            }
        }
        tempOuput[outIndex] = arr.length - beg;
        int [] result = new int[outIndex + 1];
        System.arraycopy(tempOuput, 0, result, 0, outIndex + 1);
        return result;
    }

}
