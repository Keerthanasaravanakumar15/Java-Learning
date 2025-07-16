import java.util.Scanner;
public class Trail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sq = num*num;
		int digit = sq%10;
		if(num==digit) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}

