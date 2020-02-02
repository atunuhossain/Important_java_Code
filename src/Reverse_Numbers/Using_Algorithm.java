package Reverse_Numbers;

import java.util.Scanner;

public class Using_Algorithm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbetr: ");
		
		int Number = sc.nextInt(); //1234
		
		int Reverse = 0;
		
		while (Number != 0) {
			
			Reverse = Reverse * 10 + Number % 10; // 0+1234%10= 4 -- 40+3=43 -- 430+2=432 -- 4320+1=4321
			Number = Number / 10;  // 1234/10= 123  -- 123/10=12 -- 12/10=1
		}
		
		System.out.println("Reverse number is: " +Reverse);
		
		sc.close();
	}
}
