package Array;

import java.util.Arrays;

public class Parallal_Sort {

	public static void main(String[] args) {

		int a[]	= { 10,100,70,40,20};
		System.out.println("Arrays before sort: " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("Arrays after sort: " + Arrays.toString(a));
		
		
	}

}
