import java.util.Scanner;


public class Problem5 {

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
		
		if ((num > num2) && (num > num3) && (num2 > num3)){
			System.out.println( +num+ ">" +num2+ ">" +num3);
		}
		if ((num > num2) && (num > num3) && (num3 > num2)){
			System.out.println( +num+ ">" +num3+ ">" +num2);
		}
		if ((num2 > num) && (num2 > num3) && (num > num3)){
			System.out.println( +num2+ ">" +num+ ">" +num3);
		}
		if ((num2 > num) && (num2 > num3) && (num3 > num)){
			System.out.println( +num2+ ">" +num3+ ">" +num);
		}
		if ((num3 > num) && (num3 > num) && (num3 > num2)){
			System.out.println( +num3+ ">" +num+ ">" +num2);
		}
		if ((num3 > num) && (num3 > num2) && (num3 > num)){
			System.out.println( +num2+ ">" +num+ ">" +num3);
		}
		}
	}


