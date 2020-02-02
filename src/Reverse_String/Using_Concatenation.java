package Reverse_String;

import java.util.Scanner;

public class Using_Concatenation {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any charecters: ");
		String S = sc.next();
		
		String Reverse = "";
		int Length = S.length();
		
		for (int i = Length-1 ; i >=0 ; i--)
		{
			Reverse = Reverse + S.charAt(i);
		}
		
		System.out.println("Reverse String is : " + Reverse);
		
		sc.close();
	}

}
