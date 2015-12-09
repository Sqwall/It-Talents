import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number A.");
		long num = sc.nextLong();
		System.out.println("Please input number B.");
		long num2 = sc.nextLong();
		long num3 = 0; // Sum of the printed numbers.
        long num4 = 0; 
		
		for (long i = num; i <= num2; i++) {

			if (i % 3 == 0) {
				System.out.println("Skip " + i);
			} else {
				num4 = i * i;
				System.out.println(i * i);
				num3 = (num4 + num3);
				if (num3 > 200) {
					System.out.println("Sum of the printed numbers is larger than 200.");
					break;
				}
			}

		}

	}

}
