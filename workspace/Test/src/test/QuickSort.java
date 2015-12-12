/*
 * QuickSort.java
 *
 * created at 28.11.2015 ã. by admin <YOURMAILADDRESS>
 * 
 */
package test;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class QuickSort
{

    static int[] quicksort(int array[])
    {
//        System.out.println("Initial array " + Arrays.toString(array));
        if (array.length == 0 || array.length == 1)
        {
            return array;
        }

        int pivotPosition = new Random().nextInt(array.length - 1);
        int pivot = array[pivotPosition];

//        System.out.println("Chose pivot " + pivot + " at position " + pivotPosition);
        int lcount = 0; // Number of elements smaller than pivot.
        int rcount = 0; // Number of elements larger than pivot.

        for (int i = 0; i < array.length; i++)
        {
            if (i == pivotPosition)
            {
                continue;
            }
            if (array[i] <= array[pivotPosition])
            {
                lcount++;
            }
            else
            {
                rcount++;
            }
        }

//        System.out.println("Left counter " + lcount);
//        System.out.println("Right counter " + rcount);

        int[] leftArray = new int[lcount];
        int[] rightArray = new int[rcount];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (i == pivotPosition)
            {
                // System.out.println("We've reached the pivot - skipping");
                continue;
            }

            if (array[i] <= array[pivotPosition])
            {
                leftArray[leftIndex] = array[i];
                leftIndex++;
                // System.out.println("Added to left array at index " + leftIndex + " " + array[i]);
            }
            else
            {
                if (array[i] > array[pivotPosition])
                {
                    rightArray[rightIndex] = array[i];
                    rightIndex++;
                    // System.out.println("Added to right array at index " + rightIndex + " " + array[i]);
                }
            }
        }

//        System.out.println("Left " + Arrays.toString(leftArray));
//        System.out.println("Right " + Arrays.toString(rightArray));

        return merge(quicksort(leftArray), pivot, quicksort(rightArray));
    }


    public static int[] merge(int[] array1, int pivot, int[] array2)
    {
        int[] result = new int[1 + array1.length + array2.length];
        for (int i = 0; i < result.length; i++)
        {
            if (i < array1.length)
            {
                result[i] = array1[i];
            }
            else if (i == array1.length)
            {
                result[i] = pivot;
            }
            else
            {
                result[i] = array2[i - array1.length - 1];
            }
        }

        return result;
    }


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int[] array = {3, 4, 1, 7, 32, 65, 23, 67, 4, 5, 67, 2, 2, 3, 7, 65};

        int[] result = quicksort(array);

        // System.out.print("Array is: ");
        // for (int i = 0; i < result.length; i++){
        // System.out.print(result[i] +" ");
        // }

        System.out.println(Arrays.toString(result));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please input length of the array.");

    }

}
