import java.util.Scanner;
class fat{
	void factorial(int number,int mul) {
	for(int i=1;i<=number;i++) {
		mul = mul*i;
	}
	System.out.println("The Factorial is : "+mul);
}
}
class child extends fat{
	void harshad(int num, int sum,int val) {
		int dup =num;
		while(num !=0) {
			val = num%10;
			sum = sum+val;
			num /=10;
		}
		if(dup%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not Harshad Number");
		}
	}
}
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	child obj = new child();
	obj.factorial(a, 1);
	obj.harshad(b, 0, 0);
	}

}

