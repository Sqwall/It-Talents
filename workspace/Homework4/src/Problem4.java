import java.util.Scanner;


public class Problem4
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
        int[][] array1 = new int[cols][rows];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                System.out.println("Please input value for row " +(i + 1)+ " and column " +(j + 1));
                array[i][j] = sc.nextInt();
            }

        }
        
             
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
            array1[j][rows-i-1] = array[i][j];
       
            }

        }
        
        
        
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[0].length; j++)
            {
                System.out.print(array1[i][j]);
               
            }
            System.out.println();

        }
        
    }

}
