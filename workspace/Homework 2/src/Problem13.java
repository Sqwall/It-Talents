import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		int num = sc.nextInt();
		
		int num2 = 100;
		int a = 0;
		int b = 0;
		int c = 0;

		for (num2 = 100; (num2 < 1000); num2++) {
			int num1 = num2;
			a = num1 / 100;
			num1 = num1 % 100;
			b = num1 / 10;
			c = num1 % 10;
			if ((a + b + c) == num){
				System.out.println("The sum of the didgits of your number is: " +num2);
			}		
					}
		
	}

}
