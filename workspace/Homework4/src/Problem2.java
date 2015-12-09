import java.util.Scanner;


public class Problem2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("A sqare array is needed. Please input the length of it.");
        int num = sc.nextInt();
                
        int array[][] = new int[num][num];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                System.out.println("Please enter value for row " + (row + 1) + " and column " + (col + 1));
                array[row][col] = sc.nextInt();
            }

        }

        for (int i = 0; i < array.length; i++)
        {
           System.out.print(array[i][i]);
           
        }
        System.out.println();
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j][(array.length - 1) - j]);
        {
            
        }
    }

}
