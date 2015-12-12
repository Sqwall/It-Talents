import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number between 1 and 51.");
		int num = sc.nextInt();
		if ((num < 1) || (num > 51)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}

		int n = 1;
		int i = 0; // Card number

		for (n = num; n <= 52; n++) {
			if (n % 4 == 0) {
				i = (n / 4) + 1;
			} else {
				i = (n / 4) + 2;
			}

			if (( i >= 2 ) && (i <= 10)) {
				System.out.print(i + " ");
			} else if (i == 11) {
				System.out.print("Vale ");
			} else if (i == 12) {
				System.out.print("Dama ");
			} else if (i == 13) {
				System.out.print("Pop ");
			} else if (i == 14) {
				System.out.print("Aso ");
			}
			
			if (n % 4 == 0) {
				System.out.println("Pika");
			} else if (n % 4 == 3) {
				System.out.println("Kupa");
			} else if (n % 4 == 2) {
				System.out.println("Karo");
			} else if (n % 4 == 1) {
				System.out.println("Spatiq");
			}
		}
	}

}
