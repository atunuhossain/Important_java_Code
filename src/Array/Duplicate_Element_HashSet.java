package Array;

import java.util.HashSet;

public class Duplicate_Element_HashSet {

	public static void main(String[] args) {

		String arr[] = {"Java", "C++", "python", "C", "Java"};
		HashSet <String>langs= new HashSet<String>();
		
		boolean flag = false;
		for (String value:arr)
		{
			if (langs.add(value)==false);
			{
			System.out.println("Duplicate Element is found" + value);
			flag = true;
			}
		}
		
		if (flag==false ) {
			System.out.println("Duplicate element is not found");
		}
	}

}
