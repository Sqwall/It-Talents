import java.util.Scanner;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number between 1 and 9.");
		byte num = sc.nextByte();

		if ((num < 1) || (num > 9)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}
		System.out.println("Please input a number between 1 and 9.");
		byte num2 = sc.nextByte();

		if ((num2 < 1) || (num2 > 9)) {
			System.out
					.println("Invalid number. Please restart and input a valid number.");
			return;
		}
		int i = 1;
        while (i <= num)
        {
            int j = i;
            while (j <= num2)
            {
                System.out.println(i + "*" + j + "=" + (i*j));
                j++;
            }
            i++;
            System.out.println();
        }
	}

}
