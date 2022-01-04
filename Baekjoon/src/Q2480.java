import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] array = sc.nextLine().split(" ");
		int dice1 = Integer.parseInt(array[0]);
		int dice2 = Integer.parseInt(array[1]);
		int dice3 = Integer.parseInt(array[2]);

		if ((dice1 == dice2) && (dice2 == dice3)) {
			System.out.println(10000 + dice1 * 1000);
		} else if ((dice1 == dice2) || (dice2 == dice3) || (dice1 == dice3)) {
			System.out.println(1000 + dice1 * 100);
		} else if (!(dice1 == dice2) || (dice2 == dice3) || (dice1 == dice3)) {
			int max = 0;
			if ((dice1 > dice2) && (dice1 > dice3)) {
				max = dice1;
			} else if (dice2 > dice3) {
				max = dice2;
			} else {
				max = dice3;
			}
			System.out.println(max * 100);
		}
		sc.close();
	}
}
