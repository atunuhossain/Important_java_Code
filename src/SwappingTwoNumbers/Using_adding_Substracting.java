package SwappingTwoNumbers;

public class Using_adding_Substracting {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("before swapping the numbers=  " + "a ="+a + "  b =" +b);
		
		a=a+b; // 10+20=30
		b=a-b; // 30-20=10
		a=a-b; // 30-10=20
		
		System.out.println("Numbers after swapping " + "a ="+a  +"  b =" +b);
	
	}

}
