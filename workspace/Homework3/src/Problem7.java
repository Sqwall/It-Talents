import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input array length.");

		int num = sc.nextInt();

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please input value for element " + (i + 1));
			array[i] = sc.nextInt();
		}

		int[] array2 = new int[num];

		for (int j = 0; j < array.length; j++) {
			if (j == 0) {
				array2[0] = array[1];
			} else if (j == array.length - 1) {
				array2[j] = array[j - 1];
			} else {
				array2[j] = array[j - 1] + array[j + 1];
			}
			System.out.print(array2[j]+ " ");
		}

	}
}
