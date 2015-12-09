import java.util.Scanner;


public class Problem7
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string of several words divided by spaces.");
        String str = sc.nextLine();

        if (!(str.contains(" ")))
        {
            System.out.println("String has no spaces in it. Please restart and input a valid string.");
            return;
        }

        String[] array = str.split(" ");
        int count = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i].length() > max)
            {
                max = array[i].length();
            }
            count++;
        }

        System.out.print("Number of words is: " + count + ". The largest word has " + max + " symbols.");
    }

}
