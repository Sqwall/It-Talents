import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input length of the array.");
		
		int num = sc.nextInt();
		
		double [] array = new double[num];
		
		for (int i = 0; i < array.length; i++){
			System.out.println("Please input value of element " +(i+1));
			array[i] = sc.nextDouble();
		}
		
		System.out.print("The values between -2.99 and 2.99 in this array are: ");
		for (int j = 0; j < array.length; j++){
			if ((array[j] >= -2.99) && (array[j] <= 2.99)){
				System.out.print(array[j]+ " ");
			}else{
				continue;
			}
		}
	}

}
