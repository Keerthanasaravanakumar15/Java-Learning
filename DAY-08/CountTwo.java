import java.util.Scanner;
public class CountTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num%9==0)?9:num%9);
}
}