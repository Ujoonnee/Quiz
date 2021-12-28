package com.baekjoon.java.oneDimensionalArray;
import java.util.*;

public class Q2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// get array
		int[] nArray = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		
		// get max value
		int max = nArray[0];
		int index = 1;
		for (int i = 1; i < 9; i++) {
			if (nArray[i] > max) {
				max = nArray[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}