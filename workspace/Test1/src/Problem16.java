import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a 3 didgit number.");
		int num = sc.nextInt();

		if ((num < 100) || (num > 999)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}

		int a = 0;
		int b = 0;
		int c = 0;

		a = num / 100;
		num = num % 100;
		b = num / 10;
		c = num % 10;

		if ((a == b) && (b == c) && (a == c)) {
			System.out.println("Result: Didgits are equal.");
		}

		else if ((a < b) && (b < c) && (a < c)) {
			System.out.println("Result: Digits are in ascending order.");
		}

		else if ((a > b) && (b > c) && (a > c)) {
			System.out.println("Result: Digits are in descending order.");
		}

		else {
			System.out
					.println("Result: Digits are not in any particular order.");

		}
	}
}
