import java.util.Scanner;


public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Please enter a number.");
		double num = sc.nextDouble();
		System.out.println("Please enter another number.");
		double num2 = sc.nextDouble();
		
		System.out.println(num+num2);
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/num2);
		System.out.println(num%num2);
	}

}
