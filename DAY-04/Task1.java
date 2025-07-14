import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit : ");
		int n = sc.nextInt();
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("The NUmber of digit is : "+count);
		
	}

}

