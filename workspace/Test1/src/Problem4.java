import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		double num = sc.nextDouble();
		System.out.println("Please enter a different number.");
		double num2 = sc.nextDouble();
		
		if (num == num2) {
		
			System.out.println("Numbers are equal. Please restart and enter deifferent numbers.");
			return;
		}
		
				
		if (num > num2) {
			
			System.out.println("Number: " +num+ " is bigger than " +num2 );
		}
			else {
				
				System.out.println("Number: " +num2+ " is bigger than " +num);
		
			}
		
		
	}
}

