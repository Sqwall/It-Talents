import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input length of the array");

		int a = sc.nextInt();

		int[] array = new int[a];

		System.out.println("Please input values for the array");
		for (a = 0; a < array.length; a++) {
			array[a] = sc.nextInt();
		}

		int b = 0;
		for (b = 0; b < array.length; b++) {
			if (array[b] % 3 == 0) {
				System.out.print(array[b] + " ");
			}
		}

	}

}
