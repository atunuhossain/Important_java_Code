package Counting_Numbers;

import java.util.Scanner;

public class NumberOfDigit_in_A_Number {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int N = sc.nextInt();
		
		int count = 0;
		
		while ( N > 0)
		{
			N = N / 10;
			count++;
		}
		
		System.out.println("Number of digit in the number entered is: " + count);
		
		
		sc.close();

	}
}