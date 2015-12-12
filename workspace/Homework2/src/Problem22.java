import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number between 1 and 999.");
		int num = sc.nextInt();
		
		if ((num < 1) && (num >999)){
			System.out.println("Invalid number. Please restart and input correct number.");
			return;
		} 
			
			int n = num;
			int count = 1;
			
			
			while (count <= 10) {
			
				  n++; 
				  
			  if (((n % 2 == 0) || (n % 3 == 0) || (n % 5 == 0)) ) {
				
				  System.out.print(count+ ":"+n+ "; ");
				  count++;
				  
	        }
			 
			 
			  
		}
	}
}
