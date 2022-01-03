package array;

public class Quiz03 {
	public static void main(String[] args) {
		
		// 배열 요소에 데이터 값을 넣으려면 어떻게 해야하는지 작성해보시오.
		// 이 문제는 배열을 생성한 후에 데이터 값을 입력하는 방법에 대해서 아는지를 묻는 문제이다.
		
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 11;
		}
		
		array[0] = 3;
		array[5] = 44;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
