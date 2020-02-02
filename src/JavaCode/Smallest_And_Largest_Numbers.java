package JavaCode;

import java.util.Scanner;

public class Smallest_And_Largest_Numbers {
	public static void main(String[]arg)
	{
	int numCount = 0;
	int smallest = 0;//Varriable to hold the leargest num
	int largest = 0;//Variable to hold the smallest num
	int number = 0;//Varrible to hold the current number to compare
	int count = 0;//Counts how many times the comparisn loop iterate
	String numList = "";//varrible to Store numbers

	Scanner in = new Scanner (System.in);//input variable declearation
	System.out.println("Please enter how many numbers do you want to input??");
	numCount = in.nextInt();

	while(count < numCount){
	System.out.println("Please Enter Number "+ (count+1)+ " : ");//Promt user to enter three numbers
	number = in.nextInt();//takes integer input and stores in numbers
	numList = numList + "Number "+ (count+1) + ": " + number + "\n";
	if ( count== 0){//puts first input in largest and smallest
	largest = number;
	smallest = number;
	}
	else {
	if (number >=largest)//if current number is larger than current largest num stores in the largest
	largest = number;
	else if (number <= smallest)//if current number is smaller than current smallest num stores in the largest
	smallest = number;
	}
	count++;//increaments count by one
	}

	in.close();//closes the input scanner varriable in

	System.out.print("List of Numbers entered\n"+ numList);//Prints the numbers entered
	System.out.println("Largest number is: "+ largest);//prints the Largest number
	System.out.println("Smallest number is: "+ smallest);//Prints the smallest number

	return;
	}
}
