package Array;

public class Even_Odd_EnhanceLoop {

	public static void main(String[] args) {
	
		int a[] = { 1 , 4 , 9 , 10, 99};
		
		System.out.println("All the even numbers are : ");
		for (int value : a)
		{
			if (value%2==0)
				System.out.println(value);
		}
		
		System.out.println("All the odd numbers are : ");
		for (int value : a)
		{
			if (value%2!=0)
				System.out.println(value);
		}
		
	}

}
