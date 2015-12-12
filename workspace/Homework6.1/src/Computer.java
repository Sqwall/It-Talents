/*
 * Computer.java
 *
 * created at 12.12.2015 ã. by admin <YOURMAILADDRESS>
 * 
 */
import java.util.Scanner;


public class Computer
{

    int year;
    int price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;


    public String changeOperationSystem(String newOperationSystem)
    {

        this.operationSystem = newOperationSystem;

        return operationSystem;
    }


    public int useMemory(int memory)
    {

        if (freeMemory - memory < 0)
        {
            System.out.println("Not enough free memory!");
        }
        else
        {
            freeMemory = freeMemory - memory;
        }

        return freeMemory;

    }


    public static void main(String[] args)
    {

        Computer PC = new Computer();
        PC.year = 2014;
        PC.price = 1500;
        PC.isNotebook = false;
        PC.hardDiskMemory = 200;
        PC.freeMemory = 180;
        PC.operationSystem = "Windows 7";

        Computer Laptop = new Computer();
        Laptop.year = 2014;
        Laptop.price = 1800;
        Laptop.isNotebook = true;
        Laptop.hardDiskMemory = 150;
        Laptop.freeMemory = 130;
        Laptop.operationSystem = "Windows 8";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input amount of memory you want to be saved on PC.");
        int num = sc.nextInt();
        PC.useMemory(num);
        System.out.println(PC.freeMemory);
    }
}
