import java.util.Scanner;
public class Userinput {
	public static void main(String... kee) {
		Scanner inp = new Scanner(System.in);
//		int a = inp.nextInt();
//		int b = inp.nextInt();
//		byte c = inp.nextByte();
//		System.out.println(a+b+c);
//		String name1 = inp.next();
//		System.out.println(name1);
//		String name2 = inp.nextLine();
//		System.out.println(name2);
		char object = inp.next().charAt(0);
		System.out.println(object);
	}
}
