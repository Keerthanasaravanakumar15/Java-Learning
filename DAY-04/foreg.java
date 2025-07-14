import java.util.Scanner;
public class foreg {

	public static void main(String[] args) {
		// PRIME NUMBER CALCULATION
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		int c=0;
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		System.out.println((c==2)?"The Entered Number is a Prime Number":"The Entered Number is not a Prime Number");
	}

}
