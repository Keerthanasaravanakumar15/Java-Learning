import java.util.Scanner;
interface opperation{
	void add(int a,int b);
	void sub(int a,int b);
}
class ex implements opperation{
	public void add(int a,int b) {
		System.out.println("The addition of two value is : "+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("The Subtraction of two value is : "+(a-b));
	}
}
public class ExampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a = sc.nextInt();
		System.out.print("Enter B value : ");
		int b = sc.nextInt();
		ex obj = new ex();//or ex obj = new opperation
		obj.add(a, b);
		obj.sub(a, b);
	}

}

