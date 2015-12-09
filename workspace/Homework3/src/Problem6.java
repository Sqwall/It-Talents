import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the length of the first array.");

		int num = sc.nextInt();

		int[] array = new int[num];

		int i = 0;

		for (i = 0; i < array.length; i++) {
			System.out.println("Please imput value for element " + (i + 1));
			array[i] = sc.nextInt();
		}

		System.out.println("Please input the length of the second array.");

		int num2 = sc.nextInt();

		int[] array2 = new int[num2];

		if (array.length == array2.length) {
			System.out.println("Arrays are with identical length.");
		} else {
			System.out.println("Arrays are not indentical.");
			return;
		}

		int j = 0;

		for (j = 0; j < array2.length; j++) {
			System.out.println("Please input value for element " + (j + 1));
			array2[j] = sc.nextInt();
		}

		boolean flag = true;
		int k = 0;

		for (k = 0; k < array.length; k++) {
			if (array[k] != array2[k]) {
				flag = false;
				System.out.println("Arrays are not indentical.");
			}

		}
		if (flag) {
			System.out.println("Arrays also have identical elements.");
		}

	}
}
