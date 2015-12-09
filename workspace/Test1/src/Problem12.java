import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a day.");
		int d = sc.nextInt(); // Days

		if ((d <= 0) || (d > 31)) {
			System.out
					.println("Incorrect day. Please restart and input a valid day.");
			return;
		}
		System.out.println("Please input a month.");
		int m = sc.nextInt(); // Months

		if ((m <= 0) || (m > 12)) {
			System.out
					.println("Incorrect month. Please restart and input a valid month.");
			return;
		}
		System.out.println("Please input a year.");
		int y = sc.nextInt(); // Years

		if (y <= 0) {
			System.out
					.println("Incorrect year. Please restart and input a valid year.");
			return;
		}
		
		int max = 0;
		int d1 = d;
		int m1 = m;
		int y1 = y;

		switch (m) {

		case 1:
		case 3:
		case 5:
		case 7: 
		case 8:
		case 10:
		case 12:
			 
				max = 31;
				break;
	
		case 4:
		case 6:
		case 9:
		case 11:
	
				max = 30;
				break;
		case 2:
			if ((y % 4 == 0) && ( (y % 100 != 0) || (y % 400 == 0) ) ) {
				max = 29;
			} else {
				max = 28;		
			} 
			break;
		}
					
			d1++;

			if (d1 > max){
				d1 = 1;
				m1++;
			
			}
						
			if (m1 > 12){
				d1 = 1;
				m1 = 1;
				y1++;
			}
			
	//	}
		
		System.out.println(d1+" "+m1+" "+y1);

	}

}
