package Array;

public class Sum_of_Element_enhanceLoop {

	public static void main(String[] args) {

		int a[] = { 1, 4, 6, 9, 10};
		
		int Sum = 0;
		
		for (int value:a)
		{
			Sum = Sum + value;
		}
		
		System.out.println("sum of array index is : " +Sum);
	}

}
