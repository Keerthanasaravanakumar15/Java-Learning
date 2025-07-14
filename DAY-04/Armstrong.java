import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// ARMSTRONG NUMBER
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int mul =num;
		int sum=0;
		int reverse=0;
		while (num!=0) {
			sum =sum+num%10;
			num= num/10;
		}
		int k=sum;
		while(sum!=0) {
			reverse=reverse*10+sum%10;
			sum/=10;
		}
		if(k*reverse==mul) {
			System.out.println("This is a Armstrong Number");
		}
		else {
			System.out.println("This is not a Armstrong Number");
		}
	}

}

