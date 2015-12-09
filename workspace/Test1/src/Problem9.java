import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 10 and 99.");
		int num = sc.nextInt();
		
		if ((num < 10) || (num > 99)) {
		System.out.println("Incorrect number - please restart and enter a valid number.");
		return;
		}
		System.out.println("Please enter another number between 10 and 99.");
		int num2 = sc.nextInt();
		
		if ((num2 < 10) || (num2 > 99)) {
		System.out.println("Incorrect number - please restart and enter a valid number.");
		return;
		}
		
		int num3 = num * num2;
		System.out.println("Result is: " +num3);
		  
				
		  
		   num3 = num3%10;
		   System.out.println("The last number is: "+num3);
		   
		   num3 = (num3%2);
		   if (num3 == 0) {
			   System.out.println("Number is even.");
		   }
		   else {
			   System.out.println("Number is odd.");
		   }
		   
		
		
		}
		
	}


