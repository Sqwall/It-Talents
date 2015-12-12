package test;

import java.util.Scanner;

public class MyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input rows (a) and columns (b).");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int [][] array = new int [a][b];
		
		for (a = 0; a < array.length; a++){
			for (b = 0; b < array[0].length; b++){
				System.out.println("Please input a value for row ["+a+"] and column ["+b+"]");
				array[a][b] = sc.nextInt();
			}
		}
		
		for (a = 0; a < array.length; a++) {
			for ( b = 0; b < array[a].length; b++){
				System.out.print(array[a][b]+ " ");
			}
		}
		
		System.out.println();
		
	}

}
