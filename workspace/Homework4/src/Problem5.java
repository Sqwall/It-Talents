import java.util.Scanner;


public class Problem5
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("An array of 4x4 exists.");

        int[][] array = new int[4][4];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                System.out.println("Please enter value for row " + row + " and column " + col);
                array[row][col] = sc.nextInt();
            }
        }

        int Hrow = 0; // Highest row value.
        int Hcol = 0; // Highest column value.
        int sum = 0; // Sum of present row.

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sum = sum + array[i][j];
            }
            if (sum > Hrow)
            {
                Hrow = sum;
            }
            sum=0;
        }
        System.out.println("Highest row value is :" +Hrow);
        sum = 0;
                        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sum = sum + array[j][i];
            }
            if (sum > Hcol)
            {
                Hcol = sum;
            }
            sum=0;
        }
                     
        System.out.println("Highest column value is: " +Hcol);
        
        if (Hrow > Hcol){
            System.out.println("Heighest row values is larger than highest column value.");
        }else{
            System.out.println("Heighest column values is larger than highest row value.");
        }
    }

}
