import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number between 1 and 9.");
		byte num = sc.nextByte();
		
		if ((num < 1) || (num > 9)){
			System.out.println("Invalid number. Please restart and input a valid number.");
			return;
		}
		System.out.println("Please input a number between 1 and 9.");
		byte num2 = sc.nextByte();
		
		if ((num2 < 1) || (num2 > 9)){
			System.out.println("Invalid number. Please restart and input a valid number.");
			return;
		}
		
		byte i = 0; //First number multiplier.
		byte j = 0; //Second number multiplier.
		
		for (i = 1; i <= num; i++){
			for (j = 1; j <= num2; j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}

}
