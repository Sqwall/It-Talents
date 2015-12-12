import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert a number.");
		int num = sc.nextInt();
		
		int i = 1;
		int n = 1;
		
		
		do  {
            n = n * i;
			i++;
		 
		} while (i <= num);
		System.out.println(n);
	}

}
