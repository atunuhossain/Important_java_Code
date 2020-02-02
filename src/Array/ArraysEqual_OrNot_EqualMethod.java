package Array;

import java.util.Arrays;

public class ArraysEqual_OrNot_EqualMethod {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 19, 5};
		int b[] = { 1, 2, 3, 4, 5};
		
		Boolean Status = Arrays.equals(a, b);
		
		if (Status == true)
		{
			System.out.println("Arrays are equals ");
		}
		else 
			
		{
			System.out.println("Arrays are not equals ");
		}

	}

}
