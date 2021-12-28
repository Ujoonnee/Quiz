import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 1;
		int B = 1;
		
		while (sc.hasNextInt()) {
			
			A = sc.nextInt();  
			B = sc.nextInt();
						
			if (A + B < 2) {
				break;
			} else if (A+B > 18){
				break;
			} else {		
			System.out.println(A+B);
			}
		}
	}

}
