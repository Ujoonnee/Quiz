package array;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 배열과 인덱스의 관계에 대해서 설명하고 배열의 초깃값은 어떻게 셋팅되는지 말해보시오.
		// 크기 10의 정수형 배열을 생성하고 인덱스로 배열 공간의 값을 출력해보시오.
		// 이 문제는 자바의 배열 및 인덱스 사용법 그리고 배열 생성시 초깃값이 어떻게 정해지는지를 묻는 문제이다.
		
		int[] arrayInt = new int[10];
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.print(arrayInt[i]+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = i+1;
		}
		
		for (int k : arrayInt) {
			System.out.print(k+ " ");
		}
		System.out.println();
		
		String[] arrayString = new String[10];
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i]+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < arrayString.length; i++) {
			arrayString[i] = String.valueOf(i);
		}
		
		for (String i : arrayString) {
			System.out.print(i+ " ");
		}
		
	}
}
