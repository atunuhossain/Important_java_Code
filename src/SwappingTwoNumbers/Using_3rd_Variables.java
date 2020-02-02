package SwappingTwoNumbers;

public class Using_3rd_Variables {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("before swapping the numbers=  " + "a ="+a + "  b =" +b);
		
		int N = a;
		a = b;
		b = N;
		
		System.out.println("Numbers after swapping " + "a ="+a  +"  b =" +b);
	}

}
