import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		int num = sc.nextInt();
		int chp = 1;

		// rep = Repeat
		// chp = Character Print
		for (int rep = 1; rep <= num; rep++) {
			for (int i = 1; i <= num - rep; i++) {
				System.out.print(" ");
			}
			for (chp = 1; chp <= 2 * rep - 1; chp++) {
				if ((chp == 1) || (chp == 2 * rep - 1) || (rep == num)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
				System.out.println();

			
		}
	}
}
