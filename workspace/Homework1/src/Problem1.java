import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number.");
		double num = sc.nextDouble();
		System.out.println("Please enter another number.");
		double num2 = sc.nextDouble();
		System.out.println("Please enter a third number.");
		double num3 = sc.nextDouble();

		if (((num3 > num) && (num3 < num2)) || ((num3 > num2) && (num3 < num))) {
			System.out.println("The number: " + num3 + " is between: " + num
					+ " and " + num2);
		} else {
			System.out.println("The number: " + num3 + " is not between: "
					+ num + " and " + num2);
		}

	}

}
