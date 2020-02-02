package Palindrome_Number;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Palindrome numbers are remains the same when they are reversed EX: 16461

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbetr: ");
		
		int Number = sc.nextInt(); //1234
		
		int Reverse = 0;
		
		int org_num = Number;
		
		while (Number != 0) {
			
			Reverse = Reverse * 10 + Number % 10; // 0+1234%10= 4 -- 40+3=43 -- 430+2=432 -- 4320+1=4321
			Number = Number / 10;  // 1234/10= 123  -- 123/10=12 -- 12/10=1
		}
		
		if (org_num == Reverse)
		{
			System.out.println(org_num + " is a Palindrome Number");
		}
		
		else 
		{
			System.out.println( org_num + " : is not a Palindrome Number");
		}
		
		sc.close();
		
	}
}
