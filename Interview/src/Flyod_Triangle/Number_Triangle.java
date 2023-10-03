package Flyod_Triangle;

import java.util.Scanner;

public class Number_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the No.of.Lines ==>");
		int limit = sc.nextInt();
		int startnum = 1;
		int row, col;
		
		for (row = 0; row<limit; row++) {
			for (col=0; col<=row; col++) {
				System.out.print(startnum + " ");
				startnum = startnum+1;
			}
			System.out.println();
		}

	}
}
