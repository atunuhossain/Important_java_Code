package Counting_Numbers;

public class Factorial_Numbers {

	public static void main(String[] args) {
		
		int n = 5;
		
		long Factorial = 1;
		
		for (int i = 1; i <= n; i++)
		{
			Factorial = Factorial * i;
		}
		
		System.out.println("Factorial number is: " +Factorial);
	}

}
