package Array;

public class Missing_Number {

	public static void main(String[] args) {
		//must have a starting and ending point 
		//No need to store in order 
		//must not have a duplicate

		int a[] = {1,2,4,5};
		int Sum1 = 0;
		int Sum2 = 0;
		
		for (int i = 0; i<a.length; i++)
		{
			Sum1 = Sum1 + a[i];
		}
		System.out.println("Sum of the Array is : " +Sum1);

		for (int i = 1; i <=5; i++)
		{
			Sum2 = Sum2 + i;
		}
		System.out.println("Missing Number for the array is: " +(Sum2 - Sum1));
	}

}
