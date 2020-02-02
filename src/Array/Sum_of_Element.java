package Array;

public class Sum_of_Element {

	public static void main(String[] args) {
		
		int a[] = { 5, 6, 9, 10, 100};
		
		int Sum = 0;
		
		for (int i = 0; i <= a.length-1; i++)
		{
			Sum = Sum + a[i];
		}
		
		System.out.println("sum for the array index is : " +Sum);
	}

}
