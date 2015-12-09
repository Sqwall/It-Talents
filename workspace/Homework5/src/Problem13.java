import java.util.Scanner;

public class Problem13
{
    static int [] arrayDisplay(int [] array, int [] array1){
        
        int [] array2 = new int[array.length + array1.length];
        
        for (int i = 0; i < array2.length; i++){
            if (i < array.length){
                array2[i] = array[i];
            }else{
                array2[i] = array1[i - array.length];
            }
        }
        
        return array2;
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of the first array.");
        int num = sc.nextInt();
        
        int [] array = new int[num];
        
        for (int i = 0; i < array.length; i++) {
        System.out.println("Please input value for element " +(i + 1));
        array[i] = sc.nextInt();    
        }
        System.out.println("Please input length of the second array.");
        int num1 = sc.nextInt();
        
        int [] array1 = new int[num1];
        
        for (int i = 0; i < array1.length; i++) {
        System.out.println("Please input value for element " +(i + 1));
        array1[i] = sc.nextInt();    
        }
        
        int [] array3 = new int[array.length + array1.length];
        
        array3 = arrayDisplay(array, array1);
        
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] +" ");
        }
        
    }

}