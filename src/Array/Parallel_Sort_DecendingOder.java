package Array;

import java.util.Arrays;
import java.util.Collections;

public class Parallel_Sort_DecendingOder {

	public static void main(String[] args) {
		Integer a[]	= { 10,100,70,40,20};
		System.out.println("Arrays before sort: " + Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Arrays after sort: " + Arrays.toString(a));
	}

}
