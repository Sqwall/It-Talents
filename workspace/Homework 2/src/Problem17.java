import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number between 3 and 20.");
		int num = sc.nextInt();

		if ((num < 3) || (num > 20)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}

		Scanner ch = new Scanner(System.in);
		System.out.println("Please input a character.");
		char char1 = ch.next().charAt(0);

		int i = 0; // i - Number of main loops (rows).
		int j = 0; // j - Position for printing.

		for (i = 0; i < num; i++) {
			for (j = 0; j < num; j++) {
				if ((i == 0) || (i == num - 1) || (j == 0) || (j == num - 1)) {
					System.out.print("*");
				} else {
					System.out.print(char1);
				}
			}
			System.out.println();
		}

	}
}
