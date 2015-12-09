public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;

		for (num = 100; (num < 1000); num++) {
			int num1 = num;
			int a = num1 / 100;
			num1 = num1 % 100;
			int b = num1 / 10;
			int c = num1 % 10;

			if ((a != b) && (b != c) && (a != c)) {
				System.out.println(num);
			}
			
		}

	}
}
