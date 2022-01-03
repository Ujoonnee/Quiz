package array;

public class Quiz09 {
	public static void main(String[] args) {
		
		// 배열을 복사하는 메서드를 말해보고 관련된 예제 코드를 구현해보시오.
		// 이 문제는 배열 복사시 사용하는 메서드명과 사용법에 대해서 알고 있는지를 묻는 문제이다.
		
		int[] array = {1, 2, 3, 4, 5};
		int[] arrayCopy = {0, 0, 0, 0, 3, 4, 5, 8, 9, 10};
		System.arraycopy(array, 0, arrayCopy, 0, 4);
		
		for (int i : arrayCopy) {
			System.out.print(i + " ");
		}
	}
}
