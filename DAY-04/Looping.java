import java.util.Scanner;
public class Looping {

	public static void main(String[] args) {
		// While Loop 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value :");
		int n = sc.nextInt();
		while(n>0) {
			System.out.println(n--);
		}
		System.out.print("Enter a Value :");
		int n1 = sc.nextInt();
		do {
			System.out.println(n1);
			n1--;
		}while(n1>0);

	}

}

