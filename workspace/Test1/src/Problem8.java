import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1000 and 9999.");
		int num = sc.nextInt();
		
		if ((num < 1000) || (num > 9999)) {
		System.out.println("Wrong number.Restart and enter a correct number.");
		}
		
	    int num2 = 0;
	    num2 = num;
	    
	    int a = num/1000;
	    num = num%1000;
	    int b = num/100;
	    num = num%100;
	    int c = num/10;
	    int d = num%10;
	    
        System.out.println("First nuber is: " +a+ +d);
        System.out.println("Second number is: "+b+ +c);
        
        if (((a * 10) +d ) < ((b * 10) +c)) {
        	System.out.println( a+ "" +d+ " < " +b+ "" +c);
        	if (((a * 10) +d ) > ((b * 10) +c)) 
            	System.out.println(a+ "" +d+ " < " +b+ "" +c);
            }
        
        else {
        	System.out.println(a+ "" +d+ " = " +b+ "" +c);
        }
        }
	}
	   



