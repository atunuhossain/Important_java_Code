package Reverse_String;

import java.util.Scanner;

public class Using_StringBuffer {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter any charecters: ");
	String S = sc.next();
		
	//String Reverse = "";

	StringBuffer sb = new StringBuffer(S);
	System.out.println("Reverse string is: " + sb.reverse());
		
	sc.close();		

	}

}
