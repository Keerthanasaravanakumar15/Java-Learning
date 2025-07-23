import java.util.Scanner;
abstract class operation{
	abstract void add(int a,int b);
	abstract void sub(int a,int b);
	void mult(int a,int b) {
		System.out.println("The Multiple of A and B is : "+(a*b));
	}
}
class maths extends operation{
	void add(int a,int b){
		System.out.println("The Addition of A and B is : "+(a+b));
	}
	void sub(int a,int b){
		System.out.println("The Subtraction of A and B is : "+(a-b));
	}
}
public class exampleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a = sc.nextInt();
		System.out.print("Enter B Value : ");
		int b = sc.nextInt();
		maths obj = new maths();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mult(a, b);
	}

}

