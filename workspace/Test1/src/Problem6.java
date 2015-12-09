import java.util.Scanner;


public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		double num = sc.nextDouble();
		System.out.println("Please enter a different number.");
		double num2 = sc.nextDouble();
		System.out.println("Please enter a third different number.");
		double num3 = sc.nextDouble();
		
		if ((num == num2) && (num == num3) && (num2 == num3)) {
		
			System.out.println("Numbers are equal. Please restart and enter deifferent numbers.");
			return;
		}		
			double num4;
			
			num4 = num3;
			num3 = num2;
			num2 = num;
			num = num4;
			
			System.out.println("First number is: " +num+ ", second is: " +num2+ ", third is: " +num3);
		
	
	
	}
}