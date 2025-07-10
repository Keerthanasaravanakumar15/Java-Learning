import java.util.Scanner;
//Swapping of two values
public class Swap {
	public static void main(String... kee) {
		Scanner cal = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a = cal.nextInt();
		System.out.print("Enter B value : ");
		int b = cal.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Now A value : "+a);
		System.out.println("Now B value : "+b);
		
		
	}
}
