package Counting_Numbers;

import java.util.Scanner;

public class SumOfDigit_in_A_Number {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int Number = sc.nextInt();
		
		int Count = 0;
		int Sum = 0;
		while (Number != 0)
		{
			Number = Number / 10;
			Count++;
			Sum = Sum + Count;
			
			
		}
		System.out.println(Sum + " Is a sum of numbers");
		
		sc.close();
	}
	
}
