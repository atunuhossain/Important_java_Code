package Array;

public class Min_Max {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50, 17};
		int Max = a[0];
		int Min = a[0];
		
		for (int i = 1; i<a.length; i++)
		{
			if (Max < a[i])
			Max = a[i];
		}
		System.out.println("Maximum value is: " +Max);
		
		for (int i = 1; i<a.length; i++)
		{
			if (Min > a[i])
			Min = a[i];
		}
		System.out.println("Minimum value is: " +Min);	
	}

}
