import java.util.Scanner;
public class PosNeg {
  	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = val.nextInt();
		System.out.println((num > 0 )? "The Entered number is POSITIVE" : "The Entered Number is NEGATIVE");

	}

}
