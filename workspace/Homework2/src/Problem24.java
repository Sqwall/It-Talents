import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number to check if it's palindrom.");
		int num = sc.nextInt();
		
		int num2 = 0;
		int num3 = num;
		
		while (num > 0) {
			num2 = ((num2 * 10) + (num % 10));
			num = num / 10;
		}
		if (num2 == num3) {
			System.out.println("Number is a palindrom.");
		}
		else {
			System.out.println("Number is not a palindrom.");
		}
		
	}

}
