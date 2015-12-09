public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0; // Number of main loops (new lines)
		int j = 0; // 1 to 9 variable
		int n = 0; // 9 to 0 variable

		for (i = 1; i <= 10; i++) {

			for (j = i; j < 10; j++) {
				System.out.print(j + " ");
			}
			for (n = 0; n != i; n++) {
				System.out.print(n + " ");
			}

			System.out.println();

		}
	}

}
