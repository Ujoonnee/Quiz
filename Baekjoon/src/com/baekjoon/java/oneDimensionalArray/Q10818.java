package com.baekjoon.java.oneDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		int N = sc1.nextInt();
		
		
		int[] array1 = new int[N];
		
		for (int i = 0; i < N; i++) {
			array1[i] = sc1.nextInt();
		}
		Arrays.sort(array1);
		
		
		System.out.println(Integer.toString(array1[0])+" "+Integer.toString(array1[N-1]));
		
	}
}