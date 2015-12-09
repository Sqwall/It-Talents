import java.util.Scanner;

public class Problem18
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of the array.");

        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Please input value of element " + (i + 1));
            array[i] = sc.nextInt();
        }

        System.out.println("There is an array of equal length.");

        int[] array1 = new int[num];

        for (int i = 0; i < array1.length; i++)
        {
            System.out.println("Please input value of element " + (i + 1));
            array1[i] = sc.nextInt();
        }

        int[] array2 = new int[num];
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > array1[i])
            {
                array2[i] = array[i];
            }
            else if (array1[i] > array[i])
            {
                array2[i] = array1[i];
            }
            else
            {
                array2[i] = array[i];
            }
        }

        System.out.print("First array content is: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] +" ");
        }
        System.out.println();
        System.out.print("Second array content is: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array1[i] +" ");
        }
        System.out.println();
        System.out.print("Third array content is: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array2[i] +" ");
        }
    }

}
