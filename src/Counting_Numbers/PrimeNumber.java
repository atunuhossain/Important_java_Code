package Counting_Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int n = sc.nextInt();
		int count = 0;
		
		if (n>0) {
			
			for (int i = 1; i <= n; i++)
			{
				if (n % i == 0)
				{
					count ++;
				}
			}
			if (count ==2) 
			{
				System.out.println(n + " is a prime number");
			}
			else 
			{
				System.out.println(n + " is Not a prime number");
			}
		}
		
		else 
		{
			System.out.println(n +" is Not a prime number ");
		}
		sc.close();
	}
}
