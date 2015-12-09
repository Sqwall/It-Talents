import java.util.Scanner;

public class Problem12
{

    static int [] arrayDisplay(int num){
        
        int [] array = new int [num];
        
        for (int i = 0; i < num; i++){
      
            array[i] = i;
                       
        }
        
        return array;
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of the array.");
        int num = sc.nextInt();
        
        int [] array1 = new int[num];  
        
       array1 =  arrayDisplay(num);
        
      for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] +" ");
        }
        
    }

}