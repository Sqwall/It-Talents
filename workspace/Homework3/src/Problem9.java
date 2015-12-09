import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the length of the array.");
		
		int num = sc.nextInt();
		
		int [] array = new int[num];
		
		int i = 0;
		
		for (i = 0; i < array.length; i++){
			System.out.println("Please input value for element " +(i +1));
			array[i] = sc.nextInt();
		}
		
		int [] array2 = new int[num];
		
		for (int j = 0; j < array.length; j++){
			array2[(num - 1) - j] = array[j];
		}
		
		System.out.println("These are the contents of your array: ");
		for (int k = 0; k < array.length; k++){
			System.out.print(array[k]);
		}
		
		System.out.println();
		System.out.println("And these are the contents of your second array: ");
		for (int l = 0; l < array2.length; l++){
			System.out.print(array2[l]);
		}
	}

}
