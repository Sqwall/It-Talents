//import java.util.Scanner; 
//
//public class Problem3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number.");
//		double num = sc.nextDouble();
//		System.out.println("Please enter a different number.");
//		double num2 = sc.nextDouble();
//		
//		if (num == num2) {
//		
//			System.out.println("Numbers are equal. Please restart and enter deifferent numbers.");
//			return;
//		}
//		
//				
//		double num3 ;
//		
//	    num3 = num;
//		num = num2;
//		num2 = num3;
//		
//		System.out.println("The new value of your first number is :" +num);
//		System.out.println("The new value of your second number is: " +num2);
//	}
//
//}

import java.util.Scanner;

public class Problem3 {

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
		
				
		num = (num2 + num);
		num2 = (num - num2);
		num = (num - num2);
		
		System.out.println("The new value of your first number is :" +num);
		System.out.println("The new value of your second number is: " +num2);
	}

}