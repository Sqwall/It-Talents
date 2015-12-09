import java.util.Scanner;


public class Problem3
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string without any spaces.");
        String str = sc.nextLine();

        if (str.contains(" "))
        {
            System.out.println("String has spaces in it. Please restart and input a valid string.");
            return;
        }
        System.out.println("Please input a string without any spaces.");
        String str1 = sc.nextLine();

        if (str1.contains(" "))
        {
            System.out.println("String has spaces in it. Please restart and input a valid string.");
            return;
        }

        if ((str.length() > str1.length()) || (str.length() < str1.length()))
        {
            System.out.println("Strings are of different length.");
        }
        else
        {
            System.out.println("Strings are of equal length.");
        }

        if ((str.length() < str1.length()) || (str.length() == str1.length()))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == str1.charAt(i))
                {
                    continue;
                }
                else
                {
                    System.out.println((i+1) + " " +str.charAt(i) + " - " + str1.charAt(i));
                }
            }

        }
        if ((str1.length() < str.length()))
        {
            for (int i = 0; i < str1.length(); i++)
            {
                if (str1.charAt(i) == str.charAt(i))
                {
                    continue;
                }
                else
                {
                    System.out.println((i+1) + " " +str1.charAt(i) + " - " + str.charAt(i));
                }
            }

        }
    }

}
