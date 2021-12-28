package com.baekjoon.java.forStatement;
import java.util.*;

public class Q10871 {
	public static void main(String[] args) throws IllegalStateException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
				
		StringBuilder sb = new StringBuilder();
			
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if (a<x) {
				sb.append(a+" ");
			}
			
		}
		System.out.println(sb);
	}
}

//
//import java.util.*;
//
//public class Q10871 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int x = sc.nextInt();
//		
//		Scanner sc2 = new Scanner(System.in);
//		String num = sc2.nextLine();
//		String[] array = new String[n];
//		array = num.split(" ");
//
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//
//		for (int i = 0; i < n; i++) {
//			
//			if (Integer.parseInt(array[i]) < x) {
//		
//				arr.add(Integer.parseInt(array[i]));
//				
//			}
//		}
//		
//		int size = arr.size();
//		StringBuilder sb = new StringBuilder();
//		
//		for (int q = 0; q < size; q++) {
//			sb.append(arr.get(q)+" ");
//		}
//		
//		String ans = sb.toString();
//		System.out.println(ans.trim());
//		
//	}
//}
		
		
		

		
		
		