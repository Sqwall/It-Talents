import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("What time is it now (rounded)?");
		byte hour = sc.nextByte();
		
		if ((hour < 0) || (hour > 24)) {
			System.out.println("A day has 24 hours - pealse restart and imput a valind hour");
		}
		
		
			
		    if ((hour <= 4) || (hour > 18)){
			System.out.println("Добър вечер.");
		    }
		
			if ((hour > 4) && (hour <= 9)){
			System.out.println("Добро утро.");
			}
	
			if ((hour > 9) && (hour < 18)){
			System.out.println("Добър ден.");
			}
		}
		}
		
	


