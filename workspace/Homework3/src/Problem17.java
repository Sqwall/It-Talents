import java.util.Scanner;


public class Problem17
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

        boolean flag = true;

        for (int i = 0; i < array.length - 1; i++)
        {
            if (i % 2 == 1)
            {

                if ((array[i] > array[i - 1]) && (array[i] > array[i + 1]))
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
        }
        if (flag == true)
        {
            if (num % 2 == 0)
            {
                if (array[num - 1] > array[num - 2])
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
        }
        if (flag == true)
        {
            System.out.println("The array covers the requirements for upwards zig-zag line.");
        }
        else
        {
            System.out.println("The array does not cover the requirements for upwards zig-zag line.");
        }
    }

}
