package com.baekjoon.java.whileStatement;
import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		// attach '0' if input is 1 digit
		String n;
		if (Integer.parseInt(input) < 10) {
			n = "0"+input;
		} else {
			n = input;
		}
		
		// counter i
		int i = 0;
		
		while(true) {
			
			// separate n into 2 digits
			String n1 = Integer.toString(Integer.parseInt(n)/10);
			String n2 = Integer.toString(Integer.parseInt(n)%10);
			
			// new number
			String n3 = Integer.toString((Integer.parseInt(n)/10+Integer.parseInt(n)%10)%10);
			String newNum = n2+n3;
			
			n = newNum;
			
			i++;
			
			if (Integer.parseInt(input) == Integer.parseInt(n)) {
				break;
			}
			
		
		}
		
		System.out.println(i);

	}

}