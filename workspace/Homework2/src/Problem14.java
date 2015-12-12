import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a natural number between 10 and 200.");
		int num = sc.nextInt();
		int i = 0;
		
		if ((num < 10) && (num > 200)) {
			System.out.println("Invalid number! Please restart and input a valid one.");
			return;
		}
		
		for (i = num-1; i >= 1; i--){
			if (i % 7 == 0){
				System.out.print(i+" ");
			}
			
		}
		
		
	}

}
