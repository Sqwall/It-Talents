package test;

import java.util.Scanner;


public class RecursiveFibonacci
{

    static int fibonacci(int num)
    {

        if (num == 0)
            return 0;
        else if (num <= 2)
            return 1;
        else
        return fibonacci(num - 1) + fibonacci(num - 2);
        
    }


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number.");
        int num = sc.nextInt();

        System.out.println("The " + num + "'th fibonacci number is: " + fibonacci(num));
        
       
    }
    
    
    

}