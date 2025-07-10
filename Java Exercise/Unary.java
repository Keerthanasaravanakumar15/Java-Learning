public class Unary {
	public static void main(String...kee) {
		int a =10, b=5;
		int c = a++ + b++ + ++b + ++a;
		System.out.println(c);
	}
}
