package Strings;

import java.util.Scanner;

public class Count_Words {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string Charecters");
		String S = sc.nextLine();
		int Count = 1;
		
		for (int i = 0; i< S.length()-1; i++)
		{
			if ((S.charAt(i)==' ') && (S.charAt(i+1)!=' '))
			{
				Count++;
			}
		}
		
		System.out.println("Number of word you have entered is : " + Count);
		sc.close();
	}

}
