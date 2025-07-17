//import java.util.Scanner;
//public class Power {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num2 = sc.nextInt();
//		int mul=1;
//		for(int i=1;i<=num2;i++) {
//			mul = mul*num;
//		}
//		System.out.println(mul);
//	}
//
//}

class Main{
	int number(int a, int b, int mul) {
		for(int i=1;i<=b;i++) {
			mul *= a;
		}
		return(mul);
	}
}
class Power{
	public static void main(String... args) {
		Main obj = new Main();
		int ans = obj.number(4, 3, 1);
		System.out.println(ans);
	}
}
