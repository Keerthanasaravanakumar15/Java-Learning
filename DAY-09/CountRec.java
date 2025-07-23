import java.util.Scanner;
public class CountRec {
	int countdig(int num) {
		if(num==0) {
			return 0;
		}
		return 1+countdig(num/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		 CountRec obj = new CountRec();
		 System.out.println(obj.countdig(number));
	}

}

