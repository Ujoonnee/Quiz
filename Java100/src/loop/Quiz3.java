package loop;

public class Quiz3 {

	public static void main(String[] args) {

		// 홀수, 짝수 구하기 문제를 while 반복문을 사용하여 구현해보시오.
		// 이 문제는 while 반복문과 그 안에서 조건문을 사용할 수 있는지를 묻는 문제이다.
		
		int num = 1;
		
		while(num < 30) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
		

	}

}
