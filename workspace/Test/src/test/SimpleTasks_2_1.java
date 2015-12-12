package test;


import java.util.Scanner;


public class SimpleTasks_2_1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input rows of the array.");
        int row = sc.nextInt();
        System.out.println("Please input columns of the array.");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.println("Please input element at row " + (i + 1) + " and column " + (j + 1));
                array[i][j] = sc.nextInt();
            }
        }

        boolean positiveOnly = true;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (!(array[i][j] >= 0))
                {
                    positiveOnly = false;
                }
                else
                {
                    continue;
                }

            }
        }

        System.out.println("Array contains: ");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] +" ");
            }
        }

         if (positiveOnly){
             System.out.print("and they are all positive.");
         }else{
             System.out.print("and not all of them are positive.");
         }
    }

}
