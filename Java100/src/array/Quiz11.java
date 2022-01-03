package array;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		// 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
		// 이때, 중첩 반복문을 사용하여 출력도 같이 해보시오.
		// 이 문제는 배열 생성시 사용자로 부터 입력을 받아서 2차원 배열을 만들 수 있는지를 묻는 문제이다.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("행 갯수");
		int row = sc.nextInt();
		System.out.println("열 갯수");
		int column = sc.nextInt();
		String flush = sc.nextLine();
		
		String[][] array = new String[row][column];
		for (int i = 0; i < array.length; i++) {
			System.out.println("content");
			String inputString = sc.nextLine();
			char[] arrayValue = inputString.toCharArray();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = String.valueOf(arrayValue[j]);
			}
		}
		for (String[] i : array) {
			for (String strings2 : i) {
				System.out.print(strings2 + " ");
			}
			System.out.println();
		}
		
		
	}
}
