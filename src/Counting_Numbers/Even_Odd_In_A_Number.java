package Counting_Numbers;

import java.util.Scanner;

public class Even_Odd_In_A_Number {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int Number = sc.nextInt();
		
		int even = 0;
		int odd = 0;
		
		int Count = 0;
		while (Number != 0)
		{
			Number = Number /10;
			Count ++;
			
			if (Count % 2 == 0)
			{
				even = Count;
				System.out.println(even++ +" is EVEN number");
			}
			else 
			{
				odd = Count;
				System.out.println(odd++ +" is ODD number");
			}
		}
		sc.close();

	}

}
