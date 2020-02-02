package Reverse_Numbers;

import java.util.Scanner;

public class Using_StringBuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbetr: ");
		
		int Number = sc.nextInt(); //1234
		
		StringBuffer Reverse;
		
		StringBuffer sb = new StringBuffer(String.valueOf(Number));
		Reverse = sb.reverse();
		
		System.out.println("Reverse number is: " +Reverse);
		
		sc.close();
	}

}