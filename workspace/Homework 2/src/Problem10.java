import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please input a number you wish to check if it's prime or not.");
		long num = sc.nextLong();
		int delitel = 0;

		for (long num2 = 1; num2 <= num; num2++) {

			if (num % num2 == 0) {
				delitel = delitel + 1;
				if (delitel > 2) {
					System.out.println("Number is not prime.");
					break;

				}

			}
		}
		if (delitel <= 2) {
			System.out.println("Number is prime.");
		}

	}
}
