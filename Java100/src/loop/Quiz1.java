package loop;


public class Quiz1 {

	public static void main(String[] args) {
		
		// 자바의 반복문 종류를 열거해보시고, 각각의 기본적인 사용법을 코드로 구현해보시오.
		// 이 문제는 자바의 여러 반복문 종류와 각각의 개념과 기본 사용법에 대해서 아는지를 묻는 문제이다.
		
		System.out.println("for loop");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("while loop");
		int count = 0;
		while(true) {
			if (count == 3) {
				break;
			} else {
				System.out.println(count);
				count++;
			}
		}
		
		count = 0;
		do { 
			System.out.println(count);
			count++;
		} while(count != 10);

	}

}
