package Flyod_Triangle;

import java.util.Scanner;

public class Star_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of Lines ===> ");
		int numoflines = sc.nextInt();
		
		int row,col = 0;
		 // Row 
		for (row=0; row<numoflines; row++) {
			
			 //col
			for (col=0; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
