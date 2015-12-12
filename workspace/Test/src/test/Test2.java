package test;

import java.util.Scanner;

public class Test2 {

public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A sqare array is needed. Please input the length of it.");
        int num = sc.nextInt();

        int array[][] = new int[num][num];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                System.out.println("Please enter value for row " + row + " and column " + col);
                array[row][col] = sc.nextInt();
                System.out.println("Stored into the array" + array[row][col]);
            }

        }
    

        System.out.println("done with the input, proceeding with the task");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Begginning of outer loop, i=" + i);
            for (int j = 0; j < array[i].length; i++)
            {
                System.out.println("Begginning of inner loop, j=" + i);
                while ((i > 0) && (j <= num))
                {
                    System.out.println("Begginning of while loop, i=" + i + " j=" + j);
                    System.out.print(array[i][i]);

                }
            }
        }
    }
}