import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count;
		int sum=0;
		int sq = num*num;
		while(sq !=0) {
			count = sq%10;
			sum = sum +count;    // sum=sum+sq%10; 
			sq /= 10;
		}
		if(num == sum) {
			System.out.println("The Entered number is Neon Number");
		}
		else {
			System.out.println("The Entered number is Not a Neon Number");
		}
	}

}
