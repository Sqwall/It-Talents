import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a 3 didgit number. It can't contain 0.");
		int num = sc.nextInt();
		
		if ((num < 100) || (num > 999)) {
			System.out.println("Incorrect number. Please restart and insert a valid number.");
			return;
		}
		
		int num2 = num;
		
		int a = num2/100;
		num2 = num%100;
		int b = num2/10;
		int c = num2%10;
		
		if ((a == 0) | (b == 0 ) || (c==0 )) {
			System.out.println("There is one or more zeros in the number. Please restart and insert correct number.");
			return;
		}
		
		if ((num % a) == 0) {
			System.out.println("Number can be divided to " +a);
		}
			else {
				System.out.println("Number can't be divided to " +a);
		}
		
		if ((num % b) == 0){
			System.out.println("Number can be divided by " +b);
		}
			else {
				System.out.println("Number can't be divided to " +b);
		}
		
		if ((num % c) == 0) {
			System.out.println("Number can be divided by " +c);
		}
			else {
				System.out.println("Number can't be divided to " +c);
		}
	}

}
