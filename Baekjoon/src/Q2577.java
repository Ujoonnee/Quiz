import java.util.Scanner;
 
public class Q2577 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(value);
		in.close();
		
		for (int i = 1; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}

/* 참고
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[10];
 
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
 
		String str = String.valueOf(val);
 
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
 
		for (int v : arr) {
			System.out.println(v);
		}
 
	}
}
*/