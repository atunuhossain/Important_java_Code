package Strings;

public class Occurance_of_a_Charecter {

	public static void main(String[] args) {
		
		String S = " I am a boy and I love football";
		int N = S.length();
		
		int n = S.replaceAll("[aA]", "").length();
		
		int Count = N - n;
		System.out.println("occurance occured in total: " +Count);
	}

}
