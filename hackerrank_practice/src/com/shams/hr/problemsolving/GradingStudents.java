package com.shams.hr.problemsolving;

/**
 * HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the  and the next multiple of 5 is less than 3, round grade up to the next multiple of .
If the value of grade is less than , no rounding occurs as the result will still be a failing grade.
 * @author shamsulhaque
 * @linkplain https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

	public static void main(String[] args) {
		for (int i : gradingStudents(new int [] {73,67,38,33}))
			System.out.println(i);

	}
	static int[] gradingStudents(int[] grades) {
        int [] upgradedGrades = new int [grades.length];
        int i = 0;
        for (int grade : grades) {
        	int mod = grade % 5;
        	if (mod == 0) {
        		upgradedGrades [i] = grade;
        		i++;
        	} else {
        		int diff = 5 - mod;
        		if (diff < 3 && grade >= 38) {
        			grade += diff;
        		}
        		upgradedGrades [i] = grade;
        		i++;
        	}
        }
        return upgradedGrades;
    }

}
