import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number between 10 and 5555.");
		int num = sc.nextInt();

		if ((num < 10) || (num > 5555)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}

		System.out.println("Please input another number between 10 and 5555.");
		int num2 = sc.nextInt();

		if ((num2 < 10) || (num2 > 5555)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}
		int i = 0;
		int j = 0;

		if (num < num2) {
			for (i = num2; i >= num; i--) {
				if (i % 50 == 0) {
					System.out.print(i + " ");
				}
			}
		}
		else {
			for (j = num; j >= num2; j--){
				if (j % 50 == 0) {
					System.out.print(j+ " ");
				}
			}
		}
		
	}

}
