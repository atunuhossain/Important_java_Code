package Counting_Numbers;

public class Fibonacci {

	public static void main(String[] args) {
	
		
		int n1 = 0, n2 = 1, Sum = 0;
		
		System.out.print(n1 + " " +n2);
		
		for (int i = 2 ; i < 10 ; i++)
		{
			Sum = n1 + n2;
			System.out.print(" " +Sum);
			n1 = n2;
			n2 = Sum;
		}
	}

}
