import java.util.Scanner;



public class Problem12
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 7 elements for an array.");

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        
        int sum = 0;
        sum = array[0];
        array[0] = array[1];
        array[1] = sum;
        
        array[2] = array[2] + array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];
        
        array[4] = array[4] * array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];
        
        for (int i = 0; i < array.length; i++){
            System.out.println("The new array is: " +array[i]);
        }
    }

}



