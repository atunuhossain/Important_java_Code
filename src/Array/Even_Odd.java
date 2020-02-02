package Array;

public class Even_Odd {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 5, 7, 9, 10};
		
		System.out.println("All the Even numbers are: ......");
		for (int i = 0; i<= a.length-1; i++) {
			
			if (a[i]%2==0) 
				System.out.println(a[i]);
		}
		
		System.out.println("All the odd numbers are: ......");
		for (int i = 0; i<= a.length-1; i++) {
			
			if (a[i]%2!=0) 
				System.out.println(a[i]);
		}
	}

}
