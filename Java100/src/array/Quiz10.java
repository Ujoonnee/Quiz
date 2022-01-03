package array;

import java.util.Arrays;

public class Quiz10 {
	public static void main(String[] args) {
		
		// 1, 2차원 배열의 생성 및 출력을 다양한 예제로 구현해보시오.
		// 이 문제는 자바 배열에 관해서 2차원 배열 위주로 생성 및 출력을 다양하게 해보는 종합문제입니다.
		
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = i * j;
			}
		}
		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//		}
		
		for (int i = 0; i < array.length; i++) {
			for (int is : array[i]) {
				System.out.print(is + " ");
			}
		}
		
		
	}
}
