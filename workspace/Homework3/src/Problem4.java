import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input length of the array.");
		int num = sc.nextInt();

		int[] array = new int[num];

		System.out.println("Please input content of the array.");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		boolean flag = true;

		for (int j = 0; j < array.length / 2; j++) {
			if (array[j] != array[(num - 1) - j]) {
				flag = false;
				System.out.println("Array is not mirrored.");
				break;
			}
		}

		if (flag) {
			System.out.println("Array is mirrored.");
		}

	}

}
