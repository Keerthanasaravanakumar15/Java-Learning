

public class Assign {
	public static void main(String... args) {
		int a=10, b=5, c=40;
		a=b; // a = 5
		a*=c; // a = 5 * 40 = 200
		c=a; // c = 200
		System.out.println(c/=b); // c = 200/5 = 40
	}
}
