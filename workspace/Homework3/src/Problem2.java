import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input size of the array.");

		int i = sc.nextInt(); // Size

		int[] ����� = new int[i];

		System.out.println("Please input the content of the array.");
		for (int a = 0; a < �����.length; a++) {
			�����[a] = sc.nextInt();
		}

		int j = i * 2; // Size of the second array.

		int[] �����2 = new int[j];

		for (int a = 0; a < i; a++) {
			�����2[a] = �����[a];
			�����2[2*i - 1 - a] = �����[a];
		}
		
		for (int a = 0; a < �����2.length; a++) {
			System.out.print(�����2[a] + ", ");
		}
	}

}
