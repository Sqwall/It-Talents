import java.util.Scanner;


public class Problem10
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 7 numbers.");

        int[] array = new int[7];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < array.length; j++)
        {
            sum = sum + array[j];
        }
        int AVG = sum / 7; // The average number.
        int Cdelta = 0; // Current delta
        int Bnum = array[0]; // Best number
        int Bdelta = AVG - Bnum; //Best delta
        
        if (Bdelta < 0)
        {
            Bdelta = Bdelta * (-1);
        }

        
        for (int j = 0; j < array.length; j++)
        {
            Cdelta = AVG - array[j];
           if (Cdelta < 0)
            {
                Cdelta = Cdelta * (-1);
            }
            if (Cdelta < Bdelta)
            {
                Bnum = array[j];
                
                Bdelta = AVG - Bnum;     
                
                if (Bdelta < 0)
                {
                    Bdelta = Bdelta * (-1);
                }


            }
        }
        System.out.println(Bnum);
    }

}
