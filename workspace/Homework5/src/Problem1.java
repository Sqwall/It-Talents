import java.util.Scanner;

public class Problem1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string of up to 40 letters, capital or not.");
        String str = sc.nextLine();
        
        if (str.length() > 40){
        System.out.println("Length of the string is higher than 40 letters. Please restart and input a valid number of letters.");
        return;
        }
        System.out.println("Please input another string of up to 40 letters, capital or not.");
        String str3 = sc.nextLine();
        
        if (str3.length() > 40){
        System.out.println("Length of the string is higher than 40 letters. Please restart and input a valid number of letters.");
        return;
        }
        
        String str1 = str.toUpperCase();
        
        String str2 = str.toLowerCase();
        
        String str4 = str3.toUpperCase();
        
        String str5 = str3.toLowerCase();
        
        System.out.println(str1+ " " +str2+ " " +str4+ " " +str5);
    }
        
}



