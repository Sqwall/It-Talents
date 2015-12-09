import java.util.Scanner;



public class Problem8
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string with no spaces in it.");
        String str = sc.nextLine();
        
        if (str.contains(" "))
        {
            System.out.println("String has spaces in it. Please restart and input a valid string.");
            return;
        }
        
        boolean palindrom = true;
        
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i)) != (str.charAt((str.length() - 1) - i))){
                palindrom = false;
            }else{
                continue;
            }
        }
        
        if (palindrom){
            System.out.println("String is a plaindrom.");
        }else{
            System.out.println("String is not a palindrom.");
        }
        
    }

}