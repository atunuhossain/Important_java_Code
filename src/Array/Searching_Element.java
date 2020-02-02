package Array;

public class Searching_Element {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int Element = 2;
		
		boolean flag = false;
		for (int i = 0; i< a.length; i++)
		{
			if (a[i] == Element)
			{
				System.out.println("Element " + Element + " is present in the array at: " + (Element-1));
				flag = true;
			}
		}
		
		if (flag == false)
		{
			System.out.println("Element is not found");
		}
	}

}
