import java.util.Scanner;


public class Problem15
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of the array.");

        int num = sc.nextInt();

        double[] array = new double[num];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Please input value of element " + (i + 1));
            array[i] = sc.nextDouble();
        }

        double[] array1 = new double[num];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < 0)
            {
                array1[i] = array[i] * (-1);
            }
            else
            {
                array1[i] = array[i];
            }
        }

        double max = array1[0]; // Largest number.
        double maxold = max;
        int position = 0;

        byte count = 0;

        System.out.print("The 3 numbers with largest absolute value are: ");
        while (count < 3)
        {
            for (int i = 0; i < array1.length; i++)
            {
                if ((max < array1[i]) && (array1[i] != maxold))
                {
                    max = array1[i];
                    position = i;
                }

            }

            if ((max != maxold) && (count != 0))
            {
                System.out.print(array[position] + " ");
                array1[position] = 0;
            }
            else
            {
                if (count == 0)
                {
                    System.out.print(array[position] + " ");
                    array1[position] = 0;
                }
            }

            maxold = max;
            max = 0;
            count++;
        }

    }
}
