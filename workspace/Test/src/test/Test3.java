/*
 * Test3.java
 *
 * created at 11.11.2015 ã. by admin <YOURMAILADDRESS>
 * 
 */
package test;

   import java.util.Scanner;

    public class Test3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] a = new int[rows][cols];
            int num = 1;
            
            for (int row = 0; row < rows; row++) {
                int r = row;
                int c = 0;
                
                //fills one diagonal
                while (r >= 0 && c < cols) {
                    a[r][c] = num;
                    r--;
                    c++;
                    num++;
                }
            }
            
            for (int col = 1; col < cols; col++) {
                int r = rows-1;
                int c = col;
                
                //fills one diagonal
                while (r >= 0 && c < cols) {
                    a[r][c] = num;
                    r--;
                    c++;
                    num++;
                }
            }
            
            for (int row = 0; row < a.length; row++) {
                for (int col = 0; col < a[0].length; col++) {
                    System.out.print(a[row][col] + " ");
                }
                System.out.println();
            }
        }
    }




