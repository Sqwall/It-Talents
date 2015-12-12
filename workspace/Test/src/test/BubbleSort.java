package test;


import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort
{

    static void bubbleSort(int[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            boolean isNotSorted = false;
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isNotSorted = true;
                }

            }
            if (!isNotSorted)
            {
                break;
            }
        }

    }


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of the array.");
        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Please input value for element " + (i + 1));
            array[i] = sc.nextInt();
        }

        bubbleSort(array);

        System.out.println(Arrays.toString(array));

    }

}
