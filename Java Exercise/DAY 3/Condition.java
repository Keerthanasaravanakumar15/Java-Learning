import java.util.Scanner;
public class Condition {
  public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = val.nextInt();
		if(age>=18) {
			System.out.println("You are Eligible to Vote");
		}
		else {
			System.out.println("You are not Eligible to vote");
		}
  }
}
