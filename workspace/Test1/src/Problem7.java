import java.util.Scanner;


public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("What hour is it?");
		int hour = sc.nextInt();
		
		if (hour > 24) {
			   System.out.println("There is no such hour.");
			   return;
			}
		
		System.out.println("How much money do i have?");
		double money = sc.nextDouble();
		System.out.println("Am i healthy or not?");
		boolean health = sc.nextBoolean();
		
		
		if (health == false) {
			System.out.println("I'm not going out.");
		    
			if ((health == false) && (money > 0))
				System.out.println("I will buy meds.");
			if ((health == false) && (money <= 0))
				System.out.println("I will stay home and drink tea.");
			}
		
			if ((health == true) && (money > 10)){			
				System.out.println("I'm going to the movies with friends!");
			}
			if ((health == true) && (money < 10)){
				System.out.println("I'm going to the caffeteria with friends!");
			}
			}
		
	}


