import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		long num = sc.nextLong();

		for (byte num2 = 3; num2 <= num; num2++) {
			if ((num2 % 3) == 0) {
				System.out.print(num2+",");

			}
		}
	}

}
