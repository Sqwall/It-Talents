import java.util.Scanner;


public class Problem2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string between 10 and 20 letters, capital or not.");
        String str = sc.nextLine();
        
        if ((str.length() <= 10) && (str.length() >= 20)){
        System.out.println("Invalid Length of the string. Please restart and input a valid number of letters.");
        return;
        }
        System.out.println("Please input another string between 10  and 20 letters, capital or not.");
        String str3 = sc.nextLine();
        
        if ((str3.length() >= 20) && (str3.length() <= 10)){
        System.out.println("Invalid Length of the string. Please restart and input a valid number of letters.");
        return;
        }
        
        String str1 = str.substring(0, 5);
        
        String str2 = str.substring(6, str.length());
        
        String str4 = str3.substring(0, 5);
        
        String str5 = str3.substring(6, str3.length());
        
       String str6 = (str1 + str5);
       
       String str7 = (str4 + str2);
       
       if (str6.length() > str7.length()){
           System.out.println(str6.length()+ " " +str6);
       }else{
           System.out.println(str7.length()+ " " +str7);
       }
    }

}



