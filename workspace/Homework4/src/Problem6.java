import java.util.Scanner;



public class Problem6
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
        
        int sum2 = 0;
        int sum4 = 0;
        int sum6 = 0;        
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == 2){
                    sum2 = sum2 + array[i][j];
                }
                else if (i == 4){
                    sum4 = sum4 + array[i][j];
                }
                else if (i == 6){
                    sum6 = sum6 + array[i][j];
                }
            }
        }
        System.out.println("The sum of all elements from row 2 is: " +sum2);
        System.out.println("The sum of all elements from row 4 is: " +sum4);
        System.out.println("The sum of all elements from row 6 is: " +sum6);
        System.out.println("The sum of all elements from rows 2,4 and 6 is: " +(sum2 + sum4 + sum6));
    }

}



