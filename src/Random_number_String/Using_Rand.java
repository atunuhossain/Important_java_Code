package Random_number_String;

import java.util.Random;

public class Using_Rand {

	public static void main(String[] args) {
	
		Random rand = new Random();
		
		int Rand_Num = rand.nextInt(100);
		
		System.out.println(Rand_Num);
		
		double Rand_Double = rand.nextDouble();
		
		System.out.println(Rand_Double);
		
	}

}
