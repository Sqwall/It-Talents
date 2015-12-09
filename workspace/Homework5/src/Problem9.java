import java.util.Scanner;


public class Problem9
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string with numbers and minuses in it.");
        String str = sc.nextLine();

         if (!(str.contains("-")))
         {
         System.out.println("String has no minuses in it. Please restart and input a valid string.");
         return;
         }

        String str1 = str.replaceAll("[^0-9-]+", " ");

        String numbersOnly = str1.replaceAll("\\s+", " ");
        if (numbersOnly.charAt(0) == ' ')
        {
            numbersOnly = numbersOnly.substring(1, numbersOnly.length());
        }

        String[] array = numbersOnly.split(" ");
        int sum = 0;

        System.out.println("Sum of all numbers in the sting is: ");
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            array1[i] = Integer.parseInt(array[i]);
            System.out.println(array1[i]);
            sum += array1[i];
        }
        System.out.println(sum);

    }

}
