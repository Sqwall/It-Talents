import java.util.Scanner;


public class Problem13
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number which you want to trasfer into binary numerical system.");

        int num = sc.nextInt();
        int num2 = num;

        int n = 0;
        while (num2 > 0)
        {
            num2 = num2 / 2;
            n++;
        }

        int[] array = new int[n];

        System.out.print("Your number in bunary system is: ");
        for (int i = array.length-1; i>=0  ; i--) {
            array[i]  = num % 2; 
                num = num / 2;
                
        }
                for (int i = 0; i < array.length; i++) {
             System.out.print(array[i]);
        }
    }

}
