import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		int num = sc.nextInt();
		int num2 = 0;

		if (num > 0) {

			do {
				num2 = num2 + num;
				num--;
			} while (num > 0);

			System.out.println(num2);
		}

		else {

			do {
				num2 = num2 + num;
				num++;
			} while (num < 0);

			System.out.println(num2);

		}
	}

}
