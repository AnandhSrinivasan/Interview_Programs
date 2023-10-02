package program_StringReverse;

import java.util.Scanner;

public class String_Reverse_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word to Reverse: ");
		String name = sc.nextLine();
		
		StringBuffer buff = new StringBuffer();
		buff.append(name);
		System.out.println("Word Reversed ==> "+ buff.reverse());
		sc.close();
	}
}
