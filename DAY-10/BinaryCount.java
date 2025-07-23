import java.util.Scanner;
public class BinaryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		while(num>0) {
			if(num%2==1) {
				count++;
			}
			num /=2;
		}
		System.out.println(count);
	}

}

