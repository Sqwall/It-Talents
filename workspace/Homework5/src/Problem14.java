import java.util.Scanner;

public class Problem14
{

    static int factoriel(int num){
        
        if (num <= 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }
        
        return num * factoriel(num - 1);
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number.");
        int num = sc.nextInt();
        
        int finalNumber = factoriel(num);
        System.out.println("Factoriel of " +num+ " is: " +finalNumber);
    }

}