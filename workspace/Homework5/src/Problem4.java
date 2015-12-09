import java.util.Scanner;


public class Problem4
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two full names with coma dividing them.");
        String str = sc.nextLine();

        if (!(str.contains(",")))
        {

            System.out.println("String does not include coma. Please restart and input the information properly.");
            return;
        }

        String[] array = str.split(",");

        String str1 = array[0];

        String str2 = array[1];

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < str1.length(); i++)
        {
            sum += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++)
        {
            sum1 += str2.charAt(i);
        }

        if (sum > sum1)
        {
            System.out.println(str1);
        }
        else
        {
            System.out.println(str2);
        }

    }
}
