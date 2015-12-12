import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a natural number between 10 and 99.");
		int num = sc.nextInt();

		if ((num < 10) || (num > 99)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}

		double i = 0;
		i = num;

		do {
			if (i % 2 == 0) {
				System.out.print( (i * 0.5 ) + " ");
				i = i * 0.5;
				} else {
				System.out.print(((i * 3) + 1) + " ");
				i = (i*3)+1;
			}

		} while (i > 1);

	}
}
