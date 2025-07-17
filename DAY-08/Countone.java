//import java.util.Scanner;
//public class Countone {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		int count =0;
//		int val =0;
//		while(num!=0) {
//			val=num%10;
//			count++;
//			num /=10;
//		}
//		System.out.println(count);
//	}
//
//}
class number{
	int counting(int a,int val,int count) {
		while(a!=0) {
			val = a %10;
			count++;
			a /=10;
		}
		return(count);
	}
}
class Countone{
	public static void main(String...args) {
		number obj = new number();
		int ans = obj.counting(11111,0,0);
		System.out.println(ans);
	}
}