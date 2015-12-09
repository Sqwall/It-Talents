import java.util.Scanner;


public class Problem8
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
            System.out.println("Please input value for element : " + (i + 1));
            array[i] = sc.nextInt();
        }

        int k = 0;
        int max = 0;
        for (int j = 0; j < array.length - 1; j++)
        {
            if (array[j] == array[j + 1])
            {
                k++;

            }
            else
            {
                if (k > max)
                {
                    max = k;
                }

                k = 1;
            }

        }
        if (k > max)
        {
         max = k;
        }
        System.out.println("Longest chain of eaqual elements is: " + max);
    }

}
