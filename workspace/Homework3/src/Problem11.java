import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 7 numbers.");
		
		int [] array = new int[7];
		
		for (int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
				
		int k = 0;
		
		System.out.print("The multiples of 5 and larger than 5 are: ");
		for (int j = 0; j < array.length; j++){
			if ((array[j] % 5 ==0) && (array[j] > 5)){
				k = k + 1;
				System.out.print(array[j]+ " ");
			}
		}
		System.out.println();
		System.out.println("There are " +k+ " matches.");
	}

}
