import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		long num = sc.nextLong();
		long num2 = num - 1;

		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(num2);
			}
             num2 = num2 + 2;
             System.out.println();
		}
		
	}

}
