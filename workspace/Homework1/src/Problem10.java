import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter volume between 10 and 9999 litres.");
		int volume = sc.nextInt(); 
		
		if ((volume < 10) || (volume > 9999)) {
			System.out.println("Incorrect volume. Please enter a valid number.");
			return;
		}
		
		int times = (volume / 5);
		
		int remains = (volume % 5);
		
		switch (remains) {
		
		case 1:
			System.out.println((times + 2)+ " times 2 litres.");
			System.out.println((times - 1)+ " times 3 liters.");
			break;
		case 2:
			System.out.println(times+ " times 2 liters.");
			System.out.println(times+ " times 3 liters.");
			System.out.println("Aditional bucket of 2 liters.");
			break;
		case 3:
			System.out.println(times+ " times 2 liters.");
			System.out.println(times+ " times 3 liters.");
			System.out.println("Aditional bucket of 3 liters.");
			break;
		case 4:
			System.out.println(times+ " times 2 liters.");
			System.out.println(times+ " times 3 liters.");
			System.out.println("Two aditional buckets of 2 liters.");
			break;
		}
		
	}

}
