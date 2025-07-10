public class Swap3 {
	public static void main(String...args) {
		int a = 10 ;
		int b = 20 ;
		System.out.println("A value is : "+a);
		System.out.println("B value is : "+b);
		a = a * b; // a = 10 * 20 ; a = 200
		b = a / b; // b = 200 / 20 ; b = 10
		a = a / b; // a = 200 / 10 ; a = 20
		System.out.println("Now A value is : "+a);
		System.out.println("Now B value is : "+b);
	}

}
