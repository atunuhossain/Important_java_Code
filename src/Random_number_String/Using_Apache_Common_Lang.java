package Random_number_String;

import org.apache.commons.lang3.RandomStringUtils;

public class Using_Apache_Common_Lang {

	public static void main(String[] args) {
		
	String Rand_Num = RandomStringUtils.randomNumeric(2);
	
	System.out.println(Rand_Num);
		
	String Rand_Str = RandomStringUtils.randomAlphabetic(5);
	
	System.out.println(Rand_Str);
	}

}
