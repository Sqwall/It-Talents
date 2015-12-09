import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter tamperature value between -100 and 100");
		int temp = sc.nextInt();
		
		if ((temp < -100) || (temp > 100)) {
		System.out.println("Temperature value is invalid. Please restart and imput a valid value.");
		return;
		}
		
		if (temp < -20) {
		System.out.println("Ледено студено е.");
		}
		if ((temp > -20) && (temp <= 0)) {
		System.out.println("Студено е.");	
		}
		if ((temp > 0) && (temp <= 15)) {
			System.out.println("Хладно е.");
		}
		if ((temp > 15) && (temp <= 25)) {
			System.out.println("Топло е.");
		}
		if (temp > 25) {
			System.out.println("Горещо е.");
		}
	
		
		
	}

	}

