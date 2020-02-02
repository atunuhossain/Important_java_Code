package SwappingTwoNumbers;

public class Using_Single_statement {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println("before swapping the numbers=  " + "a ="+a + "  b =" +b);
		
		b = a+b - (a = b);
		
		System.out.println("Numbers after swapping " + "a ="+a  +"  b =" +b);
	}

}
