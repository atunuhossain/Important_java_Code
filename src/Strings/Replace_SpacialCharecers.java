package Strings;

public class Replace_SpacialCharecers {

	public static void main(String[] args) {
		
		String S = "#@$&*^% Hello *%&%%$# World &%$$^ 01234";
		String s = S.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(s);
	}

}
