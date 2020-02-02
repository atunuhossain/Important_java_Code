package Strings;

public class Replace_WhiteSpace {

	public static void main(String[] args) {
		
		String S = " Hello World    white    Space";
		System.out.println("Before removing white spaces:  " +S);
		String s = S.replaceAll("\\s", "");
		System.out.println("After removing white spaces:  "+s);
	}

}
