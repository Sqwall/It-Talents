import java.util.Scanner;


public class Problem7
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("An array of 6x6 exists.");

        int[][] array = new int[6][6];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                System.out.println("Please enter value for row " + (row + 1) + " and column " + (col + 1));
                array[row][col] = sc.nextInt();
            }
        }

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < array.length; i++)
        {
            System.out.print("The elements in the row are: ");
            for (int j = 0; j < array.length; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    sum = array[i][j];
                    System.out.print(sum + ", ");
                    sum = sum + array[i][j];

                }
            }
            System.out.print("Sum of the elemets in the row is: " + sum);
            System.out.println();
            sum1 = sum1 + sum;
            sum = 0;
        }
        System.out.println("Sum of all the elements is: " + sum1);
    }

}
