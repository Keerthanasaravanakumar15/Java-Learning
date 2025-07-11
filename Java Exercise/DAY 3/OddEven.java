import java.util.Scanner;
public class OddEven {
  	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num = val.nextInt();
		if(num%2==0) {
			System.out.println("The Entered number is EVEN");
		}
		else {
			System.out.println("The Entered number is ODD");
		}
  }
}
