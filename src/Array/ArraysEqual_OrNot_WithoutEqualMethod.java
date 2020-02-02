package Array;

public class ArraysEqual_OrNot_WithoutEqualMethod {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 19, 5};
		int b[] = {1, 2, 3, 4, 5};
		
		boolean Status = true;
		if (a.length == b.length)
		{
			//if length are equals 
			for (int i =0; i < a.length; i++) {
				if (a[i] != b[i]) {
					Status = false;
				}
			}
		}
		else 
		{
			//if length are not equal
			Status = false;
		}
		
		if (Status == true ) {
			System.out.println("Arrays are Equal ***");
		}
		else {
			System.out.println("Arrays are NOT Equal ***");
		}
	}

}
