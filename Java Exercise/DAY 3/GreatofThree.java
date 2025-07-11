import java.util.Scanner;
public class GreatofThree {
  public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a = val.nextInt();
		System.out.print("Enter B value : ");
		int b = val.nextInt();
		System.out.print("Enter C value : ");
		int c = val.nextInt();
		System.out.println(((a>b) && (a>c)) ? "A is Greater of three" : ((b>a) && (b>c)) ? "B is Greater of three" : "C is Greater of three");

	}
}
