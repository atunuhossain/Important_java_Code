package Counting_Numbers;

import java.util.Scanner;

public class Largest_Smallest_Number {

	public static void main(String[] args) {
		
		int Number = 0;
		int N = 0;
		int Largest = 0;
		int Smallest = 0;
		int Count = 0;
		String NumList = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter: ");
		
		Number = sc.nextInt();
		
		while (Number > Count )
		{
			System.out.println("Please enter Number " + (Count++));
			N = sc.nextInt();
			NumList = NumList + "Number " + (Count ++) + ": " + N + "\n";
			
		}

	}

}
