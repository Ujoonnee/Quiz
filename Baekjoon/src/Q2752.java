import java.util.Scanner;

public class Q2752 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] array = input.split(" ");
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
