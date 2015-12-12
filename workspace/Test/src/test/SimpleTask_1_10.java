package test;

import java.util.Scanner;

public class SimpleTask_1_10
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number.");
        int num = sc.nextInt();
                     
        for (int i = 1; i <= num / 2; i++){
            for (int j = 1; j <= num/2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++){
              
            System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num / 2; i++){
            if (num / 2 != 0){
                for (int j = 1; j < num / 2; j++){
                    System.out.print(" ");
                }
            }else{
                for (int j = 1; j < (num / 2) - 1; j++){
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }

}