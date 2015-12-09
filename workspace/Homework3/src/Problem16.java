import java.util.Scanner;

public class Problem16
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("An array of 10 elements exists.");

        double[] array = new double[10];
        double[] array1 = new double[10];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Please input value of element " + (i + 1));
            array[i] = sc.nextDouble();
        }

        System.out.print("The original array is: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
            if (array[i] < -0.231)
            {
                array1[i] = ((i * i) + 41.25);
            }
            else
            {
                array1[i] = array[i] * i;
            }
        }
        System.out.println();
        System.out.print("The new array is: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array1[i] + " ");
        }

        double sum = 0; // Sum of all non-zero elements.
        int sum1 = 0; // Number of non-zero elements.

        for (int i = 0; i < array.length; i++)
        {
            if (array1[i] != 0)
            {
                sum = sum + array1[i];
                sum1 = sum1 + 1;

            }
        }
        
        sum = sum / sum1;
        System.out.println();
        System.out.println("The average of all numbers higher than 0 is: " + sum);
    }
}
