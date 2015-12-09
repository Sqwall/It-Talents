import java.util.Scanner;


public class Problem3
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input rows of the array.");
        int rows = sc.nextInt();
        System.out.println("Please input columns of the array.");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                System.out.println("Please input value for row " +(i + 1)+ " and column " +(j + 1));
                array[i][j] = sc.nextInt();
            }

        }
        
        int temp = 0; //Place holder.
        int k = 0; 
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                temp = temp + array[i][j];
                k++;
            }

        }
        System.out.println("Sum of all array elements is: " +temp);
        System.out.println("Average value of the array is: " +(temp / k));
    }

}
