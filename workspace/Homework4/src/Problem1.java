import java.util.Scanner;


public class Problem1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("An array of 6x5 exists.");

        int[][] array = new int[6][5];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                System.out.println("Please enter value for row " + row + " and column " + col);
                array[row][col] = sc.nextInt();
            }

        }

        int min = Integer.MAX_VALUE; // Smallest number in the array.
        //int Cmin = Integer.MAX_VALUE; // Current smallest number.
        int max = 0; // Largest number in the array.
        // int Cmax = Integer.MIN_VALUE; // Current largest number.

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] < min)
                {
                    min = array[i][j];
                }
                if (array[i][j] > max)
                {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Minimuim number in array is: " + min + ". " + "Maximum number is: " + max + ".");

    }
}
