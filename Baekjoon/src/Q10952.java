import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 1;
		int B = 1;
		
		while (true) {
			
			A = sc.nextInt();
			B = sc.nextInt();
						
			if (A == 0 && B == 0) {
				break;
			} else {
			
			System.out.println(A+B);
			}
		}
	}

}
