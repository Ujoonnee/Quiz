package conditional;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		switch(age) {
		case 10 :
			System.out.println( age+ "대입니다. 참고서 코너는 A 구역입니다." );
			break;
		case 20 :
			System.out.println( age+ "대입니다. 참고서 코너는 B 구역입니다." );
			break;
		case 30 :
			System.out.println( age+ "대입니다. 참고서 코너는 C 구역입니다." );
			break;
		case 40 :
			System.out.println( age+ "대입니다. 참고서 코너는 D 구역입니다." );
			break;
		default : 
			System.out.println("there is no recommendation");
		}
	}

}
