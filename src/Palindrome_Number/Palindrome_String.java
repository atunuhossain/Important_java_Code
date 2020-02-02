package Palindrome_Number;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
// Palindrome Strings are remains the same when they are reversed EX: MADAM

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any charecters: ");
		String S = sc.next();
		
		String org_character = S;
		
		String Reverse = "";
		char a[] = S.toCharArray();
		int Length = a.length;
		
		for (int i = Length-1 ; i >=0 ; i--)
		{
			Reverse = Reverse + a[i];
		}
		
		System.out.println("Reverse String is : " + Reverse);
		
		if (org_character.equals(Reverse))
		{
			System.out.println(org_character + " is a Palindrome String");
		}
		
		else 
		{
			System.out.println( org_character + " : is not a Palindrome String");
		}
		
		sc.close();
	}

}
