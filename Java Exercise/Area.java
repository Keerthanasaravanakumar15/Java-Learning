
import java.util.Scanner;
// Area of rectangle - l x b
public class Area {
	public static void main(String...kee) {
		Scanner cal = new Scanner(System.in);
		System.out.print("Enter the value of length : ");
		int length = cal.nextInt();
		System.out.print("Enter the value of Breadth : ");
		int breadth = cal.nextInt();
		int area = length*breadth;
		System.out.println("The Area of Rectangle is : "+area);
	}
}
